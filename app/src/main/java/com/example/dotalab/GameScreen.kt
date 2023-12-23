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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import com.example.dotalab.ui.theme.ButtonBackgroundColor
import com.example.dotalab.ui.theme.DividerColor
import com.example.dotalab.ui.theme.MainTextColor
import com.example.dotalab.ui.theme.ModernistTextBold16
import com.example.dotalab.ui.theme.ModernistTextBold20
import com.example.dotalab.ui.theme.ModernistTextBold48
import com.example.dotalab.ui.theme.ModernistTextRegular12
import com.example.dotalab.ui.theme.ModernistTextRegular16
import com.example.dotalab.ui.theme.SecondTextColor
import com.example.dotalab.ui.theme.StrokeColor
import com.example.dotalab.ui.theme.TagBackgroundColor
import com.example.dotalab.ui.theme.TagTextColor
import com.example.dotalab.ui.theme.ThirdTextColor
import com.google.android.material.chip.Chip

@Preview
@Composable
fun MainScreen() {
    Column {
        LazyColumn() {
            item {
                HeaderBackground(
                    painter = painterResource(id = R.drawable.logo),
                    modifier = Modifier
                )
            }
            item { Title(Modifier, R.drawable.icon) }
            item { GameTags(Modifier) }
            item { Description(Modifier) }
            item { ScreenShots(Modifier) }
            item { Reviews(Modifier) }
            item { Reviewers(Modifier) }
            item { InstallButton(Modifier, buttonText = R.string.install_button_label) }


        }
    }
}

