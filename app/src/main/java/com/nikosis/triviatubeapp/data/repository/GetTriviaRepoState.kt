package com.nikosis.triviatubeapp.data.repository

import com.nikosis.triviatubeapp.data.model.TriviaDrm

data class GetTriviaRepoState(
    val isLoading: Boolean = false,
    val triviaLoaded: TriviaDrm? = null,
    val loadingError: String = ""
)
