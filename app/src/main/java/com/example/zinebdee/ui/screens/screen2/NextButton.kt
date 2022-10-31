package com.example.zinebdee.ui.screens.screen2

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController



@Composable
fun NextButton(navController: NavController){
    Button(
        onClick = { // I need to pass navigation here
            navController.navigate("Screen3")

        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFAA01C7)),
        shape = CutCornerShape(10),

        )
    {
        Text("Next", color = Color.White)

    }
}