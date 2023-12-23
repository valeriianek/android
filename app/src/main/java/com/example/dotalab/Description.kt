package com.example.dotalab

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotalab.ui.theme.MainTextColor
import com.example.dotalab.ui.theme.ModernistTextRegular12


@Composable
fun Description(modifier: Modifier) {
    Spacer(modifier = modifier.padding(top = 30.dp))
    Text(
        modifier = modifier.padding(start = 24.dp),
        text = stringResource(id = R.string.description),
        color = MainTextColor,
        style = ModernistTextRegular12
    )
}