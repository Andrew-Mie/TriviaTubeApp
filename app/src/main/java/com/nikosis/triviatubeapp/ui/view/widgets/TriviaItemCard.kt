package com.nikosis.triviatubeapp.ui.view.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.nikosis.triviatubeapp.R

@Preview
@Composable
fun TriviaItemCard(/*title: String, desc: String, picUrl: String*/
//    val titleLocal= title
//    val descLocal = desc
//    val picUrlLocal = picUrl
) {

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
//                    .data(picUrl)
//                    .data(/*triviaDrm.drmSnippet*/"test")
                    .crossfade(true)
                    .build(),
                contentDescription = "Test",
                placeholder = painterResource(id = R.drawable.ic_launcher_background),
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(RoundedCornerShape(12.dp))
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 1.dp, start = 4.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "triviaDrm.channelSnippet")
                Text(text = "triviaDrm.")

            }
        }
    }

}


//
//@Preview
//@Composable
//fun Preview_TriviaItemCard(triviaDRM: TriviaDRM) {
//        TriviaTubeAppTheme {
//        TriviaItemCard()
//    }
//}