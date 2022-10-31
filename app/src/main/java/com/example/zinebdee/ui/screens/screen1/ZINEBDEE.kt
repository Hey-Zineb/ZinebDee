package com.example.zinebdee.ui.screens.screen1

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp


@Composable
fun ZINEBDEE() {
    Text(
        buildAnnotatedString
        {
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(0xFFAA01C7))) {
                append("ZINEB")
            }
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Black)){
                append("DEE")

            }


        }

    )

}


