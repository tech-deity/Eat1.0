package com.example.eat10

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.eat10.ui.Log_in
import com.example.eat10.ui.SignUp

typealias ComposableFun = @Composable ()-> Unit
sealed class TabItem(val title :String ,
//                     val icon :ImageVector,
                     val screens :ComposableFun){

    object login :TabItem("Login" ,
//        icon = Icons.Default.Lock,
        screens = { Log_in()})
    object signup :TabItem("SignUp" ,
//        icon = Icons.Default.Lock,
        screens = { SignUp()})
}
