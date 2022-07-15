package com.nikosis.triviatubeapp.data.dto


import com.google.gson.annotations.SerializedName
import com.nikosis.triviatubeapp.data.model.TriviaDrm

data class TriviaDto(
    @SerializedName("etag")
    val etag: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("nextPageToken")
    val nextPageToken: String,
    @SerializedName("pageInfo")
    val pageInfo: PageInfo,
    @SerializedName("regionCode")
    val regionCode: String
)

fun TriviaDto.toTriviaDrm(): TriviaDrm {
    return TriviaDrm(
        drmItems = items
    )
}