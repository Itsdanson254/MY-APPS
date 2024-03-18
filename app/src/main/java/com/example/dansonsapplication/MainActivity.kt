package com.example.dansonsapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dansonsapplication.ui.theme.DANSONSApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
            
            

        }
    }
}

@Composable
fun Demo(){
    Column (modifier = Modifier.fillMaxSize()){

        Text(
            text = "WELCOME TO ANDROID",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)
        Text(text = "Android is a good programming language to use",
                 fontWeight = FontWeight.Bold)


        Text(text = "Types of cars",
            fontSize = 32.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(49.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(text = "1.BMW",fontWeight = FontWeight.Bold)
        Text(text = "2.Mercedees Benz",fontWeight = FontWeight.Bold)
        Text(text = "3.Bughatti",fontWeight = FontWeight.Bold)
        Text(text = "4.Ferrari",fontWeight = FontWeight.Bold)

        Text(text = "Types of cars Brands",
            fontSize = 22.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .height(34.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(text = "1.BMW", fontWeight = FontWeight.Bold)
        Text(text = "Its one of the most popular brands thats liked by people countrywide..")
        Text(text = "2.Mercedees Benz",fontWeight = FontWeight.Bold)
        Text(text = "Its one of the more trending popular brands thats liked by people countrywide..")
        Text(text = "3.Bughatti",fontWeight = FontWeight.Bold)
        Text(text = "Its one of the  popular brands thats liked by people countrywide..")
        Text(text = "4.Ferrari",fontWeight = FontWeight.Bold)
        Text(text = "Its one of the unliked popular brands thats liked by people countrywide..")


    }

}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){

    Demo()
    
}