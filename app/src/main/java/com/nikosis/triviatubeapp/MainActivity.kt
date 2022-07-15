package com.nikosis.triviatubeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nikosis.triviatubeapp.ui.theme.TriviaTubeAppTheme
import com.nikosis.triviatubeapp.ui.view.screen.TriviaHomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriviaTubeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    MainScreen()
                    TriviaHomeScreen()
                }
            }
        }
    }
}

//@Composable
//fun MainScreen() {
//    Box(modifier = Modifier.padding(2.dp)) {
//        Button(onClick = { /*TODO*/ }) {
//
//        }
//    }
//}

//@Composable
//fun TriviaScreen() {
//    val viewModel: TriviaViewModel = viewModel()
//    val rememberedTrivia : MutableState<List<SecondResponse>> = remember {
//        mutableStateOf(emptyList<SecondResponse>())
//    }
//    viewModel.getTrivia() { response ->
//        val triviaFromApi = response?.serverDto
//        rememberedTrivia.value = triviaFromApi.orEmpty()
//    }
//    Text(text = rememberedTrivia.value.toString())
//}
//
//
//@Composable
//fun Cardoa() {
//    Card(modifier = Modifier.padding(4.dp)) {
//        Text(text = "Hi".repeat(150), maxLines = 3,overflow = TextOverflow.Ellipsis)
//    }
//}
//
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    TriviaTubeAppTheme {
//        Cardoa()
//    }
//}