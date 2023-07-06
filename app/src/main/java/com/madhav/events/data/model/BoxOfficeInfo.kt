package com.example.example

import com.google.gson.annotations.SerializedName


data class BoxOfficeInfo (

  @SerializedName("phoneNumberDetail"     ) var phoneNumberDetail     : String? = null,
  @SerializedName("openHoursDetail"       ) var openHoursDetail       : String? = null,
  @SerializedName("acceptedPaymentDetail" ) var acceptedPaymentDetail : String? = null,
  @SerializedName("willCallDetail"        ) var willCallDetail        : String? = null

)