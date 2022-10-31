package com.example.zinebdee.ui.screens.Screen3

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun GoBackButton(navController: NavController){
    Button(
        onClick = { // I need to pass navigation here
            navController.navigate("Screen1")
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFAA01C7)),
        shape = CutCornerShape(10),

        )
    {
        Text("Go Back", color = Color.White)

    }
}