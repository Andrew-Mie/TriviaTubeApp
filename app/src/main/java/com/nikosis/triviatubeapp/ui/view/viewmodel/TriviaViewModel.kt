package com.nikosis.triviatubeapp.ui.view.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nikosis.triviatubeapp.common.Resource
import com.nikosis.triviatubeapp.data.repository.GetTriviaRepo
import com.nikosis.triviatubeapp.data.repository.GetTriviaRepoState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class TriviaViewModel @Inject constructor(
    private val getTriviaRepo: GetTriviaRepo
) : ViewModel() {

    private val _state = mutableStateOf(GetTriviaRepoState())
    val state: State<GetTriviaRepoState> = _state

    init {
        getTriviaVM()
    }

    private fun getTriviaVM() {
        getTriviaRepo().onEach { results ->
            when (results) {
                is Resource.Success -> {
                    _state.value = GetTriviaRepoState(triviaLoaded = results.data)
                }
                is Resource.Loading -> {
                    _state.value = GetTriviaRepoState(isLoading = true )
                }
                is Resource.Error -> {
                    _state.value = GetTriviaRepoState(
                        loadingError = results.message ?: "Loading Error Occurred!"
                    )
                }
            }
        }.launchIn(viewModelScope)


    }
}
