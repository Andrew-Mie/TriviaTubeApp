package com.nikosis.triviatubeapp.data.repository

import com.nikosis.triviatubeapp.data.dto.TriviaDto

interface TriviaRepo {
    suspend fun getTriviaRepo(): TriviaDto
}