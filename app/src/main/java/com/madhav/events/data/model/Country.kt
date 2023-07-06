package com.example.example

import com.google.gson.annotations.SerializedName


data class Country (

  @SerializedName("name"        ) var name        : String? = null,
  @SerializedName("countryCode" ) var countryCode : String? = null

)