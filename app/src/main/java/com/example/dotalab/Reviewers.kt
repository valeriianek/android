package com.example.dotalab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotalab.ui.theme.DividerColor
import com.example.dotalab.ui.theme.ModernistTextRegular12
import com.example.dotalab.ui.theme.ModernistTextRegular16
import com.example.dotalab.ui.theme.SecondTextColor
import com.example.dotalab.ui.theme.ThirdTextColor

@Composable
fun Reviewers(modifier: Modifier) {
    Reviewer(
        modifier = modifier,
        photo = R.drawable.ava1,
        name = stringResource(id = R.string.first_reviewer_name),
        publishDate = stringResource(id = R.string.first_review_date)
    )
    Divider(
        modifier = modifier.padding(horizontal = 38.dp, vertical = 24.dp),
        thickness = 1.dp,
        color = DividerColor
    )
    Reviewer(
        modifier = Modifier,
        photo = R.drawable.ava2,
        name = stringResource(id = R.string.second_reviewer_name),
        publishDate = stringResource(id = R.string.second_review_date)
    )
}

@Composable
fun Reviewer(modifier: Modifier, photo: Int, name: String, publishDate: String) {
    Column(modifier = modifier.padding(start = 24.dp)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            Image(
                modifier = modifier
                    .size(36.dp)
                    .clip(CircleShape),
                painter = painterResource(id = photo),
                contentDescription = null
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 7.dp)
            ) {
                Text(
                    text = name,
                    color = Color.White,
                    style = ModernistTextRegular16
                )
                Text(
                    text = publishDate,
                    color = ThirdTextColor,
                    style = ModernistTextRegular12
                )
            }
        }
        Spacer(modifier = modifier.padding(top = 16.dp))
        Text(
            text = stringResource(id = R.string.second_reviewer_comment),
            color = SecondTextColor,
            style = ModernistTextRegular12
        )
    }
}