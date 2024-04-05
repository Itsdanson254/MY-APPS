package com.example.dansonsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FirstsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            firstactivity()

        }
    }
}

@Composable

fun firstactivity(){

    Row (
        modifier =Modifier

            .horizontalScroll(rememberScrollState())
            .paint(
                painterResource(id = R.drawable.bg),
                contentScale = ContentScale.FillBounds
            )
    ){

//Start of card one
        Card(modifier = Modifier
            .width(300.dp)
            .height(670.dp)
            .padding(18.dp)){



            Column (modifier = Modifier
                .fillMaxSize()
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                var mContext = LocalContext.current


                Box  (modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.ld2) ,
                        contentDescription = "Technology",
                        modifier = Modifier.size(200.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }


                Text(
                    text = " Choose Your Product",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(20.dp))

                Text(
                    text = "Here is where quality product are guaranteed to our duly customers worldwide",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp))

                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CircleShape
                ) {
                    Text(text = "NEXT")

                }

            }

        }
//End of card one


        Spacer(modifier = Modifier.width(10.dp))



//Start of card one
        Card(modifier = Modifier
            .width(300.dp)
            .height(670.dp)
            .padding(18.dp)){



            Column (modifier = Modifier
                .fillMaxSize()
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                var mContext = LocalContext.current


                Box  (modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.ld3) ,
                        contentDescription = "Technology",
                        modifier = Modifier.size(200.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }


                Text(
                    text = " Choose Your Product",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(20.dp))

                Text(
                    text = "Here is where quality product are guaranteed to our duly customers worldwide",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp))

                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CircleShape
                ) {
                    Text(text = "NEXT")

                }

            }

        }
//End of card one


        Spacer(modifier = Modifier.width(10.dp))



//Start of card one
        Card(modifier = Modifier
            .width(300.dp)
            .height(670.dp)
            .padding(18.dp)){



            Column (modifier = Modifier
                .fillMaxSize()
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                var mContext = LocalContext.current


                Box  (modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.ld5) ,
                        contentDescription = "Technology",
                        modifier = Modifier.size(200.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }


                Text(
                    text = " Choose Your Product",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(20.dp))

                Text(
                    text = "Here is where quality product are guaranteed to our duly customers worldwide",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp))

                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CircleShape
                ) {
                    Text(text = "NEXT")

                }

            }

        }
//End of card one


        Spacer(modifier = Modifier.width(10.dp))


    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun firstactivityPreview(){

firstactivity()
}
