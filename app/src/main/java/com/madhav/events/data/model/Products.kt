package com.example.example

import com.google.gson.annotations.SerializedName


data class Products (

  @SerializedName("name"            ) var name            : String?                    = null,
  @SerializedName("id"              ) var id              : String?                    = null,
  @SerializedName("url"             ) var url             : String?                    = null,
  @SerializedName("type"            ) var type            : String?                    = null,
  @SerializedName("classifications" ) var classifications : ArrayList<Classifications> = arrayListOf()

)