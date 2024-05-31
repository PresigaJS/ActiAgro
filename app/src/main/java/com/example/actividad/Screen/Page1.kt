package com.example.actividad.Screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.actividad.R

@Composable
fun Main(navHostController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
    ) {
        horizontal(navHostController)

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal(navHostController: NavHostController){
    val pagerState= rememberPagerState(initialPage = 0) {
        3
    }
    Box(modifier = Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState,modifier=Modifier.fillMaxSize()) {
                page -> when (page){
            0-> Content()
            1-> Main1()
            2-> Content3(navHostController)
        }
        }
    }
}
@Composable
fun Content(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Fila(img = R.drawable.ic_launcher_img1, descript = "Quienes somos")
        Text(text = "Quienes somos",
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp),
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,

        )
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Bienvenid@s a campos Presiga" +
                            " Aqui trabajamos con amor de nuestras granjas a tu casa  ",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 34.sp
                )

            }
        }
    }
}
@Composable
fun Fila(
    img : Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(400.dp)
                .height(400.dp))
    }
}



