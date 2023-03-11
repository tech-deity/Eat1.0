package com.example.eat10

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.eat10.ui.SplashActivity
import com.example.eat10.ui.theme.Eat10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Eat10Theme {
                // A surface container using the 'background' color from the theme
               SplashActivity()
            }
        }
    }
}

//
//fun hideSystemUI(){
//    WindowCompat.setDecorFitsSystemWindows(window,false)
//    if(Build.VERSION.SDK_INT<Build.VERSION_CODES.R){
//        window.add
//    }
//
//}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Eat10Theme {
        SplashActivity()
    }
}