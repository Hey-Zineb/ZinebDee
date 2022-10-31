package com.example.zinebdee.ui.screens

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@Composable
fun StartButton(navController: NavController){
    Button(
        onClick = {
            navController.navigate("Screen2")

        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFAA01C7)),
        shape = CutCornerShape(10),

        )
    {
        Text("Start", color = Color.White)

    }
}