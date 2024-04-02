package com.example.dansonsapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dansonsapplication.ui.theme.DANSONSApplicationTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

Assign()

        }
    }
}

@Composable
fun Assign(){
Column(
    modifier =Modifier
        .verticalScroll(rememberScrollState())
        .fillMaxSize()) {

    Spacer(modifier = Modifier.height(20.dp))


    Box (
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.wf) ,
            contentDescription ="register",
            modifier=Modifier.size(180.dp)
        )
    }




    //card 1
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.dg1),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Koda",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "2 years old")
            }
        }

    }

    //end of card 1

    Spacer(modifier = Modifier.height(20.dp))




    //card 2
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.dg1),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Lola",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "16 years old")
            }
        }

    }

    //end of card 2

    Spacer(modifier = Modifier.height(20.dp))



    Spacer(modifier = Modifier.height(20.dp))

    //card 3
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.dg2),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Frankie",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "2 years old")
            }
        }

    }

    //end of card 3

    Spacer(modifier = Modifier.height(20.dp))


    Spacer(modifier = Modifier.height(20.dp))

    //card 4
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.alaskanmalamut),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Nox",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = " 8 years old")
            }
        }

    }

    //end of card 4

    Spacer(modifier = Modifier.height(20.dp))


    Spacer(modifier = Modifier.height(20.dp))

    //card 5
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.dg8),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Faye",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "8 years old")
            }
        }

    }

    //end of card 5

    Spacer(modifier = Modifier.height(20.dp))


    Spacer(modifier = Modifier.height(20.dp))

    //card 6
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
             Image(painter = painterResource(id = R.drawable.germansherphard),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Bella",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "14 years old")
            }
        }

    }

    //end of card 6

    Spacer(modifier = Modifier.height(20.dp))



    Spacer(modifier = Modifier.height(20.dp))

    //card 7
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.dg6),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Moane",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "2 years old")
            }
        }

    }

    //end of card 7

    Spacer(modifier = Modifier.height(20.dp))



    Spacer(modifier = Modifier.height(20.dp))

    //card 8
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(10.dp)
    ){

        Row {
            Image(painter = painterResource(id = R.drawable.dg6),
                contentDescription = "Koda",
                modifier = Modifier
                    .size(60.dp)
                    .padding(start = 10.dp, top = 10.dp)
                    .clip(shape = CircleShape),)

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text ="Tzeitel",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(text = "7 years old")
            }
        }

    }

    //end of card 8

    Spacer(modifier = Modifier.height(20.dp))








}
}

@Preview(showBackground = true)
@Composable
fun AssignPreview(){

    Assign()
}
