package com.example.dansonsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()){


        val mContext = LocalContext.current
        Text(
            text = "WELCOME TO ANDROID",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)
        Text(text = "Android is a good programming language to use",
                 fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {  mContext.startActivity(Intent(mContext,DESTINATIONACTIVITY::class.java)) },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "DESTINATION")
        }


        Button(onClick = {  mContext.startActivity(Intent(mContext,ExploreActivity::class.java)) },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "EXPLORE")
        }

        Button(onClick = {  mContext.startActivity(Intent(mContext,AssignmentActivity::class.java)) },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "DISCOVER")
        }



        Spacer(modifier = Modifier.height(12.dp))

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
        Spacer(modifier = Modifier.height(13.dp))
        Text(text = "Types of cars Brands",
            fontSize = 22.sp,
            modifier = Modifier
                .height(45.dp)
                .fillMaxWidth()
                .background(Color.Red)
                .height(34.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(text = "1.BMW", fontWeight = FontWeight.Bold)

        Text(text = "2.Bughatti",fontWeight = FontWeight.Bold)

        Text(text = "3.Ferrari",fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))
       Divider()
        Text(
            text = "Its one of the unliked popular brands thats liked by people countrywide.",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold)
        

        //CENTERING AN IMAGE
       Box  (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center){
           Image(painter = painterResource(id = R.drawable.mat) ,
               contentDescription = "Technology",
               modifier = Modifier.size(200.dp)
                   .clip(shape = CircleShape),
               contentScale = ContentScale.Crop
           )
       }

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                      mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                  .fillMaxWidth()
                  .padding(start = 30.dp, end = 30.dp)
        ) {
Text(text = "CONTINUE")
        }

       }

    }
  

@Preview(showBackground = true)
@Composable
fun DemoPreview(){

    Demo()
    
}