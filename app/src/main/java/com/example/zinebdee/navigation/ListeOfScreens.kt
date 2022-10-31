package com.example.zinebdee.navigation

import java.lang.IllegalArgumentException

//www.google.com/sign_in
enum class ListeOfScreens {
    Screen1,
    Screen2,
    Screen3;
    companion object  {
        fun fromeRoute(route: String?): ListeOfScreens
        = when (route?.substringBefore(delimiter = "/")) {
            Screen1.name -> Screen1
            Screen2.name -> Screen2
            Screen3.name -> Screen3
            null -> Screen1
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }

    }
}