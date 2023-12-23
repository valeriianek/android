package com.example.dotalab

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalab.ui.theme.ModernistTextBold20
import com.example.dotalab.ui.theme.ModernistTextRegular12
import com.example.dotalab.ui.theme.StrokeColor
import com.example.dotalab.ui.theme.ThirdTextColor

@Composable
fun Title(
    modifier: Modifier = Modifier,
    @DrawableRes logoImage: Int = R.drawable.icon
) {
    Row(modifier.offset(24.dp, (-22).dp)) {
        Logo(modifier = modifier)
        Column(
            modifier = Modifier.padding(top = 34.dp, start = 12.dp)
        ) {
            Text(
                text = stringResource(id = R.string.dota_2),
                color = Color.White,
                style = ModernistTextBold20
            )
            Spacer(modifier = modifier.padding(top = 5.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Rating(modifier = modifier)
            }
        }
    }
}

@Composable
fun Logo(modifier: Modifier, @DrawableRes logoImage: Int = R.drawable.icon) {
    Card(
        modifier = Modifier.size(size = 88.dp),
        shape = RoundedCornerShape(13.dp),
        colors = CardDefaults.cardColors(Color.Black),
        border = BorderStroke(width = 2.dp, color = StrokeColor),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = modifier.size(size = 54.dp),
                painter = painterResource(id = logoImage),
                contentDescription = null
            )
        }
    }
}

@Composable
fun Rating(modifier: Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(5) {
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.star),
                contentDescription = null
            )
        }
        Text(
            modifier = modifier,
            text = stringResource(id = R.string.game_rating),
            color = ThirdTextColor,
            style = ModernistTextRegular12
        )
    }
}

@Preview
@Composable
fun TitlePreview(){
    Title(Modifier, R.drawable.icon)
}