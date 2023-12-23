package com.example.dotalab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotalab.ui.theme.ModernistTextBold48
import com.example.dotalab.ui.theme.ModernistTextRegular12
import com.example.dotalab.ui.theme.SecondTextColor

@Composable
fun Reviews(modifier: Modifier) {
    Spacer(modifier = modifier.padding(top = 12.dp))
    Row(
        modifier = modifier.padding(start = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.game_rating_review_value),
            color = Color.White,
            style = ModernistTextBold48

        )
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            Row(
                modifier = modifier,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                repeat(5) {
                    Image(
                        modifier = modifier.size(size = 12.dp),
                        painter = painterResource(R.drawable.star),
                        contentDescription = null
                    )
                }
            }
            Text(
                text = stringResource(id = R.string.game_review_description),
                modifier = modifier,
                color = SecondTextColor,
                style = ModernistTextRegular12

            )
        }
    }
    Spacer(modifier = modifier.padding(bottom = 32.dp))
}