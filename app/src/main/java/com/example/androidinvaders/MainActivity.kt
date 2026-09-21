package com.example.androidinvaders

import android.R.attr.contentDescription
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidinvaders.ui.theme.AndroidInvadersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidInvadersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BasicComponentsScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    GameOver(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen (modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color.Black)){

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically)
        {
            Text(
                text = "SCORE: 0050",
                color = Color.White
            )

            Row(
                Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "LIVES:",
                    color = Color.White
                )

                AndroidEnemy(
                    modifier = Modifier.size(50.dp),
                    color = Color.Green,

                    )
                AndroidEnemy(
                    modifier = Modifier.size(50.dp),
                    color = Color.Green
                )
                AndroidEnemy(
                    modifier = Modifier.size(50.dp),
                    color = Color.Green
                )
            }
        }


        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            AndroidEnemy(
                modifier = Modifier.size(70.dp),
                color = Color.Green,

                )
            AndroidEnemy(
                modifier = Modifier.size(70.dp),
                color = Color.Red
            )
            AndroidEnemy(
                modifier = Modifier.size(70.dp),
                color = Color.Blue
            )
            AndroidEnemy(
                modifier = Modifier.size(70.dp),
                color = Color.Yellow,

                )
            AndroidEnemy(
                modifier = Modifier.size(70.dp),
                color = Color.Green
            )
        }

        Box(Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter){

            NaveHero(
                modifier = Modifier.padding(bottom = 60.dp).size(100.dp)

            )

            Text(
                text = "PRESS START",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(10.dp),
                color = Color.White,
                textAlign = TextAlign.Center,

            )

        }
    }
}

@Composable
fun GameOver (modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(Color.Black)
    ) {
        Box(Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center){

            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Green,

                    )
                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Red
                )
                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Blue
                )
                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Yellow,

                    )
                AndroidEnemy(
                    modifier = Modifier.size(80.dp),
                    color = Color.Green
                )
            }

            Text(
                text = "GAME OVER",
                color = Color.White,
                fontSize = 67.sp
            )
        }

    }
}

@Composable
fun AndroidEnemy (modifier: Modifier = Modifier, color: Color) {

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Android Enemy"
    )

}

@Composable
fun NaveHero(modifier: Modifier = Modifier) {

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.nave),
        contentDescription = "Android Enemy"
    )

}