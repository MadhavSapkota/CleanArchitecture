package com.madhav.events.di
import com.madhav.events.common.Constants
import com.madhav.events.data.remote.EventAPI
import com.madhav.events.data.repository.EventRepistoryImpl
import com.madhav.events.domain.repository.EventRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HIltModules {
    @Provides
    @Singleton
    fun provideEventAPI(): EventAPI {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(EventAPI::class.java)
    }

    @Provides
    fun provideEventRepository(eventAPI: EventAPI): EventRepository {
        return EventRepistoryImpl(eventAPI)
    }
}
