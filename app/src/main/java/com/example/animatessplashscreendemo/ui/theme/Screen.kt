package com.example.animatessplashscreendemo.ui.theme

sealed class Screen( val route:String){
    object Splash:Screen("splash_Screen")
    object Home:Screen("home_screen")
}
