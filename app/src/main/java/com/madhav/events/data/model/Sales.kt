package com.example.example

import com.google.gson.annotations.SerializedName


data class Sales (

  @SerializedName("public"   ) var public   : Public?             = Public(),
  @SerializedName("presales" ) var presales : ArrayList<Presales> = arrayListOf()

)