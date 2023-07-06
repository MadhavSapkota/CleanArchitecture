package com.example.example

import com.google.gson.annotations.SerializedName


data class Location (

  @SerializedName("longitude" ) var longitude : String? = null,
  @SerializedName("latitude"  ) var latitude  : String? = null

)