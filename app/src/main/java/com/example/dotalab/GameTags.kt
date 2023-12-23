package com.example.dotalab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import com.example.dotalab.ui.theme.TagBackgroundColor
import com.example.dotalab.ui.theme.TagTextColor

@Composable
fun GameTags(modifier: Modifier) {
    Row(
        modifier = modifier.padding(start = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 10.dp)
    ) {
        Tag(text = stringResource(id = R.string.tag1), modifier)
        Tag(text = stringResource(id = R.string.tag2), modifier)
        Tag(text = stringResource(id = R.string.tag3), modifier)
    }
}

@Composable
fun Tag(text: String, modifier: Modifier) {
    Chip(
        colors = ChipDefaults.chipColors(TagBackgroundColor),
        modifier = modifier.height(height = 24.dp),
        label = { Text(text, fontSize = 10.sp, color = TagTextColor) }, onClick = {},
        shape = RoundedCornerShape(100.dp),
    )
}
