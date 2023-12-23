package com.example.dotalab

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotalab.ui.theme.ButtonBackgroundColor
import com.example.dotalab.ui.theme.ModernistTextBold20

@Composable
fun InstallButton(modifier: Modifier, buttonText: Int) {
    Spacer(modifier = modifier.padding(24.dp))
    TextButton(
        onClick = { },
        modifier = modifier
            .fillMaxWidth()
            .height(height = 64.dp),
        shape = RoundedCornerShape(size = 12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = ButtonBackgroundColor),
    ) {
        Text(
            text = stringResource(id = buttonText),
            color = Color.Black,
            style = ModernistTextBold20
        )
    }
}