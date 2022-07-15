package com.nikosis.triviatubeapp.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Item(
    @Json(name = "etag")
    val etag: String,
    @Json(name = "id")
    val id: Id,
    @Json(name = "kind")
    val kind: String,
    @Json(name = "snippet")
    val snippet: Snippet
)