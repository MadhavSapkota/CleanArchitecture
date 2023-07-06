package com.example.example

import com.google.gson.annotations.SerializedName
import com.madhav.events.data.model.Embedded


data class ExampleJson2KtKotlin (

    @SerializedName("_embedded" ) var Embedded : Embedded? = Embedded(),
    @SerializedName("_links"    ) var Links    : Links?    = Links(),
    @SerializedName("page"      ) var page     : Page?     = Page()

)