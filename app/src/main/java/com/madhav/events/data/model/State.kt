package com.example.example

import com.google.gson.annotations.SerializedName


data class State (

  @SerializedName("name"      ) var name      : String? = null,
  @SerializedName("stateCode" ) var stateCode : String? = null

)