package com.example.eat10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.Surface

import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

import com.example.eat10.ui.theme.Eat10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Eat10Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    NavController(rememberNavController())


                }
            }
        }
    }
}
