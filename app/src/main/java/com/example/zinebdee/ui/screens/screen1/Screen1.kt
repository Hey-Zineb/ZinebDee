package com.example.zinebdee.ui.screens.screen1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.zinebdee.R
import com.example.zinebdee.ui.screens.StartButton


@Composable
fun Screen1(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        ZINEBDEE()

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.group_1),
                    contentDescription = null,
                    modifier = Modifier
                        .height(350.dp)
                        .width(300.dp)

                )
                Row {
                    Text(
                        text = "Welcome to ",
                        fontWeight = FontWeight.Bold
                    )
                    ZINEBDEE()
                }
                Text(
                    text = "We are here to help you test you mobile apps ",
                    color = Color(69,90,100) ,
                    fontWeight = FontWeight.Medium

                )
                Spacer(modifier = Modifier.size(150.dp))
                Box(
                    modifier = Modifier
                        .height(200.dp)
                        .width(300.dp),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.group_2),
                            contentDescription = null,
                            modifier = Modifier
                                .height(10.dp)
                                .width(100.dp)

                        )
                        StartButton(navController = navController)

                        Image(
                            painter = painterResource(id = R.drawable.rectangle_2),
                            contentDescription = null,
                            modifier = Modifier
                                .height(30.dp)
                                .width(250.dp)

                        )
                    }

                }


            }
        }
    }

}