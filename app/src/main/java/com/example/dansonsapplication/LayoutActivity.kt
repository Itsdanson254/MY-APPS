package com.example.dansonsapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dansonsapplication.ui.theme.DANSONSApplicationTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun Layout() {

    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "HOME", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
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
        Spacer(modifier = Modifier.height(5.dp))
    Text(
        text = "BREEDS OF DOGS",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )


//Row one
        Row {

            Image(painter = painterResource(id = R.drawable.germansherphard),
                contentDescription = "These is the most wanted dog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Siberian Husky", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Its one of the most wanted dog mby kenyans soldiers during training.")
            }
        }
//End of row one
        Spacer(modifier = Modifier.height(5.dp))

//Row two
        Row {

            Image(painter = painterResource(id = R.drawable.alaskanmalamut),
                contentDescription = "These is the most wanted dog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Siberian Husky", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Its one of the most wanted dog mby kenyans soldiers during training.")
            }
        }
//End of row two
        Spacer(modifier = Modifier.height(5.dp))

        //Row three
        Row {

            Image(painter = painterResource(id = R.drawable.bulldog),
                contentDescription = "These is the most wanted dog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Siberian Husky", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Its one of the most wanted dog mby kenyans soldiers during training.")
            }
        }
//End of row three
        Spacer(modifier = Modifier.height(5.dp))

          Button(onClick = { /*TODO*/ },
          modifier = Modifier.fillMaxWidth(),
              shape = CircleShape) {
              Text(text = "NEXT")
              
          }


    }
}


@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()

}