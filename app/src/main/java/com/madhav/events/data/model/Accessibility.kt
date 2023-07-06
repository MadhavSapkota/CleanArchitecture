package com.example.example

import com.google.gson.annotations.SerializedName


data class Accessibility (

  @SerializedName("info")
  var info : String? = null,

  @SerializedName("ticketLimit")
  var ticketLimit : Int?    = null

)