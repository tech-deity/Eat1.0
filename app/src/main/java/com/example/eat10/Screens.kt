package com.example.eat10

sealed class Screens (val route :String){
    object First :Screens("First")
    object Splash :Screens("Splash")
}