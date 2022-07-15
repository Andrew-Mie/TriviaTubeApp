package com.nikosis.triviatubeapp.ui.view.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikosis.triviatubeapp.R
import com.nikosis.triviatubeapp.ui.theme.TriviaTubeAppTheme

@Composable
fun TriviaAppTopBar() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.secondary,
        contentColor = MaterialTheme.colors.onSurface,
        elevation = 4.dp,
        title = {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 5.dp),
                text = stringResource(id = R.string.task_name),
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AppTopBarPreview() {
    TriviaTubeAppTheme {
        TriviaAppTopBar()
    }
}