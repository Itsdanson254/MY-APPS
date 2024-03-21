package com.example.dansonsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dansonsapplication.ui.theme.DANSONSApplicationTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    MyIntents()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents(){

Column(modifier = Modifier
    .fillMaxSize()
    .fillMaxSize()
    .paint(
        painterResource(id = R.drawable.bcgrd),
        contentScale = ContentScale.FillBounds
    )


){

    var mContext = LocalContext.current

    //TopAppBar
    TopAppBar(
        title = { Text(text = "HOME", color = Color.White) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
        navigationIcon = {
            IconButton(onClick = {
                mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
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

OutlinedButton(
    onClick = { /*TODO*/ },
    modifier = Modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp),
    shape = RoundedCornerShape(5.dp),
    border = BorderStroke(2.dp, Color.Black)
) {
    Text(text = "MPESA", color = Color.White)
}

    Spacer(modifier = Modifier.height(15.dp))


    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(text = "CAMERA", color = Color.White)
    }

    Spacer(modifier = Modifier.height(15.dp))


    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(text = "EMAIL", color = Color.White)
    }

    Spacer(modifier = Modifier.height(15.dp))


    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(text = "SMS", color = Color.White)
    }

    Spacer(modifier = Modifier.height(15.dp))

    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(text = "CALL", color = Color.White)
    }

    Spacer(modifier = Modifier.height(15.dp))


    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Text(text = "SHARE", color = Color.White)
    }

    Spacer(modifier = Modifier.height(15.dp))


}


}
@Preview(showBackground = true)
@Composable
fun MyIntentsPreview(){
MyIntents()

}
