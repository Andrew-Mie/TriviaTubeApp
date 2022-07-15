package com.nikosis.triviatubeapp.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Thumbnails(
    @Json(name = "default")
    val default: Default,
    @Json(name = "high")
    val high: High,
    @Json(name = "medium")
    val medium: Medium
)