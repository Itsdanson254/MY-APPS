package com.example.dansonsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Search
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dansonsapplication.ui.theme.DANSONSApplicationTheme

class DESTINATIONACTIVITY : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
Column (modifier = Modifier.fillMaxSize()){

var mContext = LocalContext.current
    //TopAppBar
    TopAppBar(
        title = { Text(text = "DESTINATION", color = Color.White) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
        navigationIcon = {
            IconButton(onClick = {
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "arrowback",
                    tint = Color.White
                )

            }

        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share",
                    tint = Color.White
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "settings",
                    tint = Color.White
                )
            }
        }
    )

    //These the end of top up bar
Box (
    modifier = Modifier
        .fillMaxWidth()
        .height(200.dp),
    contentAlignment = Alignment.Center
){

Image(painter = painterResource(id = R.drawable.dest2),
    contentDescription = "newyork",
    modifier = Modifier.fillMaxSize(),
    contentScale = ContentScale.Crop)

    Text(
        text ="Lets plan our next vacation",
        fontSize = 35.sp,
        color = Color.White,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center
    )
}
//End of box

    Spacer(modifier = Modifier.height(10.dp))
var search by remember { mutableStateOf("")
}
    OutlinedTextField(
        value = search,
        onValueChange = {search = it} ,
        placeholder = { Text(text = "What's your destination ? ")},
        leadingIcon ={ Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
Text(
    text = "Recently viewed",
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    modifier = Modifier.padding(start = 20.dp))
    Spacer(modifier = Modifier.height(10.dp))

Row (
    modifier =Modifier
        .horizontalScroll(rememberScrollState())
){

    //card1
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.classic) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "JAPAN",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card
    Spacer(modifier = Modifier.width(10.dp))

    //card2
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd1) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "EUROPE",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 2
    Spacer(modifier = Modifier.width(8.dp))

    //card 3
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd2) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "PAKISTAN",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 3
    Spacer(modifier = Modifier.width(8.dp))

    //card 4
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd4) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "INDONESIA",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 4
    Spacer(modifier = Modifier.width(8.dp))

    //card 5
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd5) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "JAMAICA",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 5
    Spacer(modifier = Modifier.width(8.dp))

    //card 6
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd6) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "ENGLAND",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 6
    Spacer(modifier = Modifier.width(8.dp))

    //card 7
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd7) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "TOKYO",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 7
    Spacer(modifier = Modifier.width(8.dp))

    //card 8
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.china) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "FRANCE",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 8
    Spacer(modifier = Modifier.width(8.dp))

    //card 9
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.cd1) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "GERMANY",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 9
    Spacer(modifier = Modifier.width(8.dp))

    //card 10
    Card(modifier = Modifier
        .width(200.dp)
        .height(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
                contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(id = R.drawable.falls) ,
                    contentDescription ="classic",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )

            }
            Text(
                text = "WATERFALL",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
    //End of card 10
    Spacer(modifier = Modifier.width(8.dp))
}
    }
}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
Destination()


}

