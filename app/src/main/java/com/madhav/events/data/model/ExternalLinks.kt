package com.example.example

import com.google.gson.annotations.SerializedName


data class ExternalLinks (

  @SerializedName("youtube"     ) var youtube     : ArrayList<Youtube>     = arrayListOf(),
  @SerializedName("twitter"     ) var twitter     : ArrayList<Twitter>     = arrayListOf(),
  @SerializedName("itunes"      ) var itunes      : ArrayList<Itunes>      = arrayListOf(),
  @SerializedName("lastfm"      ) var lastfm      : ArrayList<Lastfm>      = arrayListOf(),
  @SerializedName("facebook"    ) var facebook    : ArrayList<Facebook>    = arrayListOf(),
  @SerializedName("wiki"        ) var wiki        : ArrayList<Wiki>        = arrayListOf(),
  @SerializedName("spotify"     ) var spotify     : ArrayList<Spotify>     = arrayListOf(),
  @SerializedName("musicbrainz" ) var musicbrainz : ArrayList<Musicbrainz> = arrayListOf(),
  @SerializedName("instagram"   ) var instagram   : ArrayList<Instagram>   = arrayListOf(),
  @SerializedName("homepage"    ) var homepage    : ArrayList<Homepage>    = arrayListOf()

)