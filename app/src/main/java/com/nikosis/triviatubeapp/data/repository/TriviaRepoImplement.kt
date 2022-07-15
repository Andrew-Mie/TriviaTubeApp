package com.nikosis.triviatubeapp.data.repository

import com.nikosis.triviatubeapp.data.api.TriviaApi
import com.nikosis.triviatubeapp.data.dto.TriviaDto
import javax.inject.Inject

class TriviaRepoImplement @Inject constructor(
    private val api: TriviaApi
) : TriviaRepo {
    override suspend fun getTriviaRepo(): TriviaDto {
        return api.getTriviaDto()
    }
}