package com.madhav.events.data.model

import com.google.gson.annotations.SerializedName


data class AgeRestrictions (

  @SerializedName("legalAgeEnforced" )
  var legalAgeEnforced : Boolean? = null

)