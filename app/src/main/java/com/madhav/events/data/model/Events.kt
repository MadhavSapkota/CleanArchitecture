package com.madhav.events.data.model
import com.example.example.Accessibility
import com.example.example.Classifications
import com.example.example.Dates
import com.example.example.Images
import com.example.example.Links
import com.example.example.PriceRanges
import com.example.example.Products
import com.example.example.Promoter
import com.example.example.Promoters
import com.example.example.Sales
import com.example.example.Seatmap
import com.example.example.TicketLimit
import com.example.example.Ticketing
import com.google.gson.annotations.SerializedName


data class Events(

    @SerializedName("name") var name: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("test") var test: Boolean? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("locale") var locale: String? = null,
    @SerializedName("images") var images: ArrayList<Images> = arrayListOf(),
    @SerializedName("sales") var sales: Sales? = Sales(),
    @SerializedName("dates") var dates: Dates? = Dates(),
    @SerializedName("classifications") var classifications: ArrayList<Classifications> = arrayListOf(),
    @SerializedName("promoter") var promoter: Promoter? = Promoter(),
    @SerializedName("promoters") var promoters: ArrayList<Promoters> = arrayListOf(),
    @SerializedName("pleaseNote") var pleaseNote: String? = null,
    @SerializedName("priceRanges") var priceRanges: ArrayList<PriceRanges> = arrayListOf(),
    @SerializedName("products") var products: ArrayList<Products> = arrayListOf(),
    @SerializedName("seatmap") var seatmap: Seatmap? = Seatmap(),
    @SerializedName("accessibility") var accessibility: Accessibility? = Accessibility(),
    @SerializedName("ticketLimit") var ticketLimit: TicketLimit? = TicketLimit(),
    @SerializedName("ageRestrictions") var ageRestrictions: AgeRestrictions? = AgeRestrictions(),
    @SerializedName("ticketing") var ticketing: Ticketing? = Ticketing(),
    @SerializedName("_links") var Links: Links? = Links(),
    @SerializedName("_embedded") var Embedded: Embedded? = Embedded()

)