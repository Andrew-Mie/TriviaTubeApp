package com.nikosis.triviatubeapp.ui.view.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.nikosis.triviatubeapp.R

@Composable
fun TriviaItemCard(title: String, desc: String, picUrl: String) {
//    val titleLocal = title
//    val descLocal = desc
//    val picUrlLocal = picUrl

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        shape = RoundedCornerShape(corner = CornerSize(4.dp)),
        elevation = 6.dp
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Surface(
                modifier = Modifier
                    .padding(12.dp)
                    .size(90.dp),
                shape = RectangleShape,
                elevation = 4.dp
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(picUrl)
                        .crossfade(true)
                        .build(),
                    placeholder = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "Channel Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clip(RectangleShape)
                )
            }
            Column(
                modifier = Modifier.padding(4.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.h6,
                    fontSize = 16.sp,
                    color = Color.Red,
                    overflow = TextOverflow.Ellipsis
                )
                Divider()
                Spacer(modifier = Modifier.size(7.dp))
                Text(
                    text = desc,
                    style = MaterialTheme.typography.caption,
                    fontSize = 12.sp,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.LightGray
                )
            }
        }
    }
}


@Preview
@Composable
fun Preview_TriviaItemCard() {

    TriviaItemCard(
        title = "Test", desc = "Test", picUrl = ""
    )

}