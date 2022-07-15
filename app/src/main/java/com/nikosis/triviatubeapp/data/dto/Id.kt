package com.nikosis.triviatubeapp.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Id(
    @Json(name = "kind")
    val kind: String,
    @Json(name = "videoId")
    val videoId: String
)