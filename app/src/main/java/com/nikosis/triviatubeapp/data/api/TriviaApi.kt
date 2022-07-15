package com.nikosis.triviatubeapp.data.api

import com.nikosis.triviatubeapp.common.Constants
import com.nikosis.triviatubeapp.data.dto.TriviaDto
import retrofit2.http.GET

interface TriviaApi {
    @GET(Constants.JSON_DB)
    suspend fun getTriviaDto(): TriviaDto
}