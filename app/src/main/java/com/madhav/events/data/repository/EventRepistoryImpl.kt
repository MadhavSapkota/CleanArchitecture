package com.madhav.events.data.repository
import com.madhav.events.data.model.Events
import com.madhav.events.data.remote.EventAPI
import com.madhav.events.domain.repository.EventRepository

class EventRepistoryImpl(private val eventSearchAPI: EventAPI) : EventRepository {
    
    override suspend fun getEventList(): Events {
        return eventSearchAPI.getEventList()
    }
}