package com.example.coba1

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnaFont = 0xfff4f4ea
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
            //Row()

                Image(painter = painterResource(id = R.drawable.seventeenn),
                    contentDescription = "gambar")

                Surface(
                   color = Color.Gray,
                   modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Seventeen righ here",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(
                            start = 24.dp,
                            top = 16.dp,
                            end = 16.dp,
                            bottom = 16.dp
                        ),
                        color = Color(warnaFont)
                    )
                }
                Surface(
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "It's ok, I won't let you down",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(24.dp, 16.dp, 16.dp, 16.dp),
                        color = Color(warnaFont)
                    )
                }
            }
        }
    }
}

//@preview(showbackground = true, showSystemU1)
//@composable
//fun EchoText(){
