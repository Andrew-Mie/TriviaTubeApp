package com.nikosis.triviatubeapp.data.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PageInfo(
    @Json(name = "resultsPerPage")
    val resultsPerPage: Int,
    @Json(name = "totalResults")
    val totalResults: Int
)