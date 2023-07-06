package com.madhav.events.domain.repository
import com.madhav.events.data.model.Events


interface EventRepository {
    suspend fun getEventList(): Events
}