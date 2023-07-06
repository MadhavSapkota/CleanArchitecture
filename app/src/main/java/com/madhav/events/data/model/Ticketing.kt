package com.example.example

import com.google.gson.annotations.SerializedName


data class Ticketing (

  @SerializedName("safeTix"             ) var safeTix             : SafeTix?             = SafeTix(),
  @SerializedName("allInclusivePricing" ) var allInclusivePricing : AllInclusivePricing? = AllInclusivePricing()

)