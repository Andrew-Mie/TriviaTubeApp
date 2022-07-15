package com.nikosis.triviatubeapp.ui.view.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.nikosis.triviatubeapp.ui.view.viewmodel.TriviaViewModel
import com.nikosis.triviatubeapp.ui.view.widgets.TriviaAppTopBar
import com.nikosis.triviatubeapp.ui.view.widgets.TriviaItemCard

@Composable
fun TriviaHomeScreen(viewModel: TriviaViewModel = hiltViewModel()) {
    val state = viewModel.state.value
    Scaffold(topBar = { TriviaAppTopBar() }) {
        Box(modifier = Modifier.fillMaxSize()) {
            state.triviaLoaded?.let {
                LazyColumn {
                    items(state.triviaLoaded.drmItems.subList(fromIndex = 0, toIndex = 10)) { x ->
                        TriviaItemCard(
                            title = x.snippet.title,
                            desc = x.snippet.description,
                            picUrl = x.snippet.thumbnails.default.url
                        )
                    }
                }
            }

            if (state.loadingError.isNotBlank()) {

                Text(
                    text = state.loadingError,
                    color = MaterialTheme.colors.error,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .align(Alignment.Center)
                )
            }

            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }
}