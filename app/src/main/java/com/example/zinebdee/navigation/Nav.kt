package com.example.zinebdee.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zinebdee.ui.screens.Screen3.Screen3
import com.example.zinebdee.ui.screens.screen1.Screen1
import com.example.zinebdee.ui.screens.screen2.Screen2


@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = ListeOfScreens.Screen1.name) {
        composable(ListeOfScreens.Screen1.name) {
            // here we pass where this should lead us to
            // i dont import i need to pass the composable screen1
            Screen1(navController = navController)
            }
        composable(ListeOfScreens.Screen2.name){
            Screen2(navController = navController)
        }
        composable(ListeOfScreens.Screen3.name){
            Screen3(navController = navController)
        }
    }

}