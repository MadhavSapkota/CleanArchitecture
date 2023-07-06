package com.example.example

import com.google.gson.annotations.SerializedName


data class GeneralInfo (

  @SerializedName("generalRule" ) var generalRule : String? = null,
  @SerializedName("childRule"   ) var childRule   : String? = null

)