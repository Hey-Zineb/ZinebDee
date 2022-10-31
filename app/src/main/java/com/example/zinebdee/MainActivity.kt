package com.example.zinebdee
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.zinebdee.navigation.Nav
import com.example.zinebdee.ui.screens.Screen3.Screen3
import com.example.zinebdee.ui.screens.screen1.Screen1
import com.example.zinebdee.ui.screens.screen2.Screen2
import com.example.zinebdee.ui.theme.ZinebDeeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZinebDeeTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.surface
                ) {
                    Nav()

                }

                }

            }
        }
}













