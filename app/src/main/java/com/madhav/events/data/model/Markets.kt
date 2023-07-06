package com.example.example

import com.google.gson.annotations.SerializedName


data class Markets (

  @SerializedName("name" ) var name : String? = null,
  @SerializedName("id"   ) var id   : String? = null

)