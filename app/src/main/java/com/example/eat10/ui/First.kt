package com.example.eat10.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.navigation.NavController
import com.example.eat10.Screens
import com.example.eat10.ui.theme.TealOrange
import kotlinx.coroutines.delay

@Composable
fun First(navController: NavController){

    LaunchedEffect(key1 = true){
        delay(2500)
        navController.navigate(Screens.Splash.route)
        {
            popUpTo(0)
        }
    }
    Box(
        modifier = Modifier
            .background(TealOrange)
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        CircleBox(shape = CircleShape)
    }
}

