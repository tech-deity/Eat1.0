package com.example.eat10.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.eat10.R
import com.example.eat10.ui.theme.SF_Round
import com.example.eat10.ui.theme.TealOrange


@Composable
fun SplashActivity(){


    Box(modifier = Modifier
        .background(TealOrange)
        .fillMaxSize()){
        Column {
            TopExp()
            RandomImages()

        }
    }

}

@Composable
fun TopExp(){
    Box(

        ){

        Column(modifier = Modifier.padding(top = 44.dp , start = 34.dp))
        {
            CircleBox(shape = CircleShape)

            Text(text = "Food for Everyone ",
                style = TextStyle(
                    fontFamily = SF_Round,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 65.sp
                )
            )

        }

    }

}

@Composable
fun RandomImages(){

    ConstraintLayout(

    ) {
        val (one , two ) = createRefs()

        Row(
                modifier = Modifier
               .constrainAs(one){},
            horizontalArrangement = Arrangement.Center) {
            ConstraintLayout() {
                val (img1, img2) = createRefs()
                Image(painter = painterResource(id = R.drawable.tff2),
                    contentDescription = "random image one",
                    modifier = Modifier
                        .size(220.dp)
                        .constrainAs(img1) {}
                )

                Image(painter = painterResource(id = R.drawable.tff1),
                    contentDescription = "random image two",
                    modifier = Modifier
                        .size(200.dp)
                        .constrainAs(img2) {
                            start.linkTo(img1.end)
                        }
                )
            }

        }

        Button(

            onClick = { /*TODO*/

                      },
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .width(350.dp)
                .height(50.dp)
                .padding(start = 30.dp )

                .constrainAs(two){
                    top.linkTo(one.bottom,40.dp)
                }


        ) {
            Text(text = "Get Started"
                , color = TealOrange)
        }




    }


}



@Preview(name="SplashScreen" , showSystemUi = true)
@Composable
fun PreviewSplashActivity(){
    SplashActivity()
}