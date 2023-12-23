package com.example.dotalab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painter, contentDescription = null,
        modifier
            .fillMaxWidth()
            .height(337.dp),
        contentScale = ContentScale.FillWidth
    )

}

@Preview
@Composable
fun HeaderBackgroundPreview(){
    HeaderBackground(painter = painterResource(id = R.drawable.logo),
        modifier = Modifier)
}