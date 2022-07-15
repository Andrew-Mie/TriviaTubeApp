package com.nikosis.triviatubeapp.data.dto


import com.nikosis.triviatubeapp.data.model.TriviaDrm
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TriviaDto(
    @Json(name = "etag")
    val etag: String,
    @Json(name = "items")
    val items: List<Item>,
    @Json(name = "kind")
    val kind: String,
    @Json(name = "nextPageToken")
    val nextPageToken: String,
    @Json(name = "pageInfo")
    val pageInfo: PageInfo,
    @Json(name = "regionCode")
    val regionCode: String
)

fun TriviaDto.toTriviaDrm(): TriviaDrm {
    return TriviaDrm(
        drmItems = items
    )
}