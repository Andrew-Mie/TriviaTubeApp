package com.nikosis.triviatubeapp.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Snippet(
    @Json(name = "channelId")
    val channelId: String,
    @Json(name = "channelTitle")
    val channelTitle: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "liveBroadcastContent")
    val liveBroadcastContent: String,
    @Json(name = "publishedAt")
    val publishedAt: String,
    @Json(name = "thumbnails")
    val thumbnails: Thumbnails,
    @Json(name = "title")
    val title: String
)