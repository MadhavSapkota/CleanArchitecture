package com.madhav.events.data.remote
import com.madhav.events.data.model.Events
import retrofit2.http.GET

interface EventAPI {
    @GET("discovery/v2/events.json?apikey=S3IURwLm6MuL50gi0FrOrCAcGvFaADoK")
    suspend fun getEventList(): Events
}