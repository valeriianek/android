package com.example.dotalab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ScreenShots(modifier: Modifier) {
    Spacer(modifier = modifier.padding(top = 15.dp))
    LazyRow(
        modifier = modifier.padding(start = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 15.dp)
    ) {
        items(1) {
            Box(contentAlignment = Alignment.Center) {
                Image(
                    modifier = modifier
                        .size(width = 240.dp, height = 128.dp)
                        .clip(RoundedCornerShape(size = 14.dp)),
                    painter = painterResource(id = R.drawable.scr2),
                    contentDescription = null
                )
                Image(
                    modifier = modifier.size(size = 48.dp),
                    painter = painterResource(id = R.drawable.play_button),
                    contentDescription = null
                )
            }
            Image(
                modifier = modifier
                    .size(width = 240.dp, height = 128.dp)
                    .clip(RoundedCornerShape(size = 14.dp)),
                painter = painterResource(id = R.drawable.scr1),
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
fun ScreenShotsPreview(){
ScreenShots(modifier = Modifier)
}