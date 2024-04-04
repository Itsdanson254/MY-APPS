package com.example.dansonsapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.dansonsapplication.ui.theme.DANSONSApplicationTheme
import com.example.dansonsapplication.ui.theme.Orange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
mysplash()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(1000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()

            }
        }
    }
}

@Composable

fun mysplash(){
Column (modifier = Modifier
    .fillMaxSize()

    .paint(
        painterResource(id = R.drawable.fx6),
        contentScale = ContentScale.FillBounds
    ),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {


    //Lottie Animation
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(composition, progress,
        modifier = Modifier.size(300.dp)
    )
//END OF Lottie Animation

    Text(
        text = "MY FOREX TRADER",
        fontSize = 35.sp,
        fontWeight = FontWeight.ExtraBold,
        modifier = Modifier.padding(20.dp))



    Text(
        text = "THE MONEY MAKER",
        fontSize = 35.sp,
        fontWeight = FontWeight.ExtraBold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp))

}

}
@Preview(showBackground = true)
@Composable
fun mysplashpreview(){

    mysplash()
}
