package com.madhav.events.data.model
import com.google.gson.annotations.SerializedName

data class Embedded(
    @SerializedName("events") var events: ArrayList<Events> = arrayListOf()

)