package com.example.example

import com.google.gson.annotations.SerializedName


data class Presales (

  @SerializedName("startDateTime" ) var startDateTime : String? = null,
  @SerializedName("endDateTime"   ) var endDateTime   : String? = null,
  @SerializedName("name"          ) var name          : String? = null

)