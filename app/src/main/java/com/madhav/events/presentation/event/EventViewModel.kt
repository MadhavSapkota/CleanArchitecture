package com.madhav.events.presentation.event
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.madhav.events.common.Resource
import com.madhav.events.domain.use_case.GetEventListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventViewModel @Inject constructor(
    private val eventListUseCase: GetEventListUseCase
) : ViewModel() {

    private val _eventList = MutableSharedFlow<EventState>()
    val eventList: SharedFlow<EventState> get() = _eventList.asSharedFlow()

    fun getEventList() {
        viewModelScope.launch {
            eventListUseCase().onEach { resource ->
                when (resource) {
                    is Resource.Loading -> {
                        _eventList.tryEmit(EventState(isLoading = true))
                    }
                    is Resource.Success -> {
                        _eventList.tryEmit(EventState(data = resource.data))
                    }
                    is Resource.Error -> {
                        _eventList.tryEmit(EventState(error = resource.message ?: ""))
                    }
                }
            }.launchIn(viewModelScope)
        }
    }

}
