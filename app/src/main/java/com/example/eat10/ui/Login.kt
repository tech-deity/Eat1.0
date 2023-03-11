package com.example.eat10.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eat10.R
import com.example.eat10.TabItem
import com.example.eat10.ui.theme.SF_Round
import com.example.eat10.ui.theme.TealOrange
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch


@Composable
fun Login(){

    Box(modifier = Modifier

        .fillMaxSize()) {
        Column() {
            Dabba()
            MainContent ()

        }
    }
}
@Composable
fun Dabba()
    {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
                .background(Color.White)
        )
        {

            Icon(painter = painterResource(id = R.drawable.chef_icon),

                contentDescription = "logo",
                tint = TealOrange,
                modifier = Modifier.size(150.dp))

        }

    }


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainContent (){
    val list = listOf(TabItem.login, TabItem.signup)
    val pagerState = rememberPagerState(1)
    Column(modifier = Modifier.fillMaxWidth())
    {
            TabExp(list ,pagerState )
            TabContent(tabs = list, pagerState = pagerState)
    }
}


// create tab layout and view pager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabExp(tabs:List<TabItem>,pagerState: PagerState){

    // to handle the onclick event we need scope
    val scope  = rememberCoroutineScope()

    TabRow(selectedTabIndex = pagerState.currentPage,
            indicator = {tabPositions ->
                Modifier
                    . pagerTabIndicatorOffset(pagerState = pagerState,
                        tabPositions = tabPositions) }
        ) {
            tabs.forEachIndexed{
                index, tabItem ->

                LeadingIconTab(selected = pagerState.currentPage == index,
                    onClick = { scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                              },

                    text = { Text(tabItem.title) },

                    icon = {
//                        Icon(imageVector = tabItem.icon, contentDescription = null )
                    }

                )


            }
        }
}




@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabContent(tabs:List<TabItem>, pagerState: PagerState){


    HorizontalPager(state = pagerState) {
        page ->  tabs[page].screens()
    }

}


@Composable
fun Log_in(){
    Box(
        modifier = Modifier
            .fillMaxSize()){

        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            val username = remember { mutableStateOf(TextFieldValue()) }
            val password = remember { mutableStateOf(TextFieldValue()) }



            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = {Text(text = "UserName")},
                value = username.value,
                onValueChange = {username.value = it }
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = {Text(text = "Password")},
                value = password.value,

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = {password.value = it }
            )


            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)){
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = TealOrange)



                ){
                    Text(text = "Login", modifier = Modifier
                    )

                }
            }

        }

    }
}

@Composable
fun SignUp(){
    Box(

        modifier = Modifier
            .fillMaxSize()


    ){

        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            val username = remember { mutableStateOf(TextFieldValue()) }
            val password = remember { mutableStateOf(TextFieldValue()) }

//            Text(text = "Login",
//                style = TextStyle(
//                    fontSize = 40.sp,
//                    fontFamily = SF_Round)
//            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = {Text(text = "UserName")},
                value = username.value,
                onValueChange = {username.value = it }
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = {Text(text = "Password")},
                value = password.value,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = {password.value = it }
            )


            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)){
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = TealOrange)


                ){
                    Text(text = "Login")
                }
            }

        }

    }
}




@Preview(name="login page", showSystemUi = true)
@Composable
fun PreviewLogin()
{
    Login()
}