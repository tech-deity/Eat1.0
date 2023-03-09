package com.example.eat10.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eat10.ui.theme.TealOrange

@Composable
fun Logo(){


    CircleBox(shape = CircleShape)

}


@Composable
fun CircleBox(shape: Shape){
    Column(
        ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(73.dp)
                .clip(shape)
                .background(Color.White)
        ){
            Icon(painter = painterResource(id =com.example.eat10.R.drawable.chef_icon),

                contentDescription = "logo",
                tint = TealOrange,
                modifier = Modifier.size(56.dp))

        }

    }
}



@Preview( name = "icon ")
@Composable
fun PreviewLogo(){
    Logo()
}