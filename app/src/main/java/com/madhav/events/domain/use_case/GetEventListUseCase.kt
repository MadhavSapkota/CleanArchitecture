package com.madhav.events.domain.use_case
import com.madhav.events.common.Resource
import com.madhav.events.data.model.Events
import com.madhav.events.domain.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetEventListUseCase @Inject constructor(private val repository: EventRepository) {


    operator fun invoke(): Flow<Resource<out List<Any>>> = flow {
        try {
            emit(Resource.Loading())
            val data = repository.getEventList()
            val domainData = if (data.Embedded != null) data.Embedded!!.events.map { it -> it.Embedded!!.events } else emptyList()

            System.out.println("ValueTTTTTT" + data.Embedded)

            emit(Resource.Success(data = domainData))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "An Unknown error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Check Connectivity"))
        } catch (e: Exception) {

        }
    }


}