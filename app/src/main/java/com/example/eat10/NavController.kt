package com.example.eat10

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.eat10.ui.First
import com.example.eat10.ui.Login
import com.example.eat10.ui.SplashScreenActivity

@Composable
fun NavController(controller: NavHostController){
    NavHost(navController = controller, startDestination = Screens.First.route ){

        composable(Screens.First.route){
            First(navController= controller)
        }

        composable(Screens.Splash.route){
            SplashScreenActivity(navController = controller )
        }

        composable(Screens.Login.route){
            Login()
        }
    }
}