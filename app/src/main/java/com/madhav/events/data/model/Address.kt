package com.example.example

import com.google.gson.annotations.SerializedName


data class Address (
  @SerializedName("line1" )
  var line1 : String? = null

)