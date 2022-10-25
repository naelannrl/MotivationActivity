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

        val warnaFont = 0xff008080
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
                        text = "Hello Selasa, good to me please",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 16.dp),
                        color = Color(warnaFont)
                    )
                }
                Surface(
                    color = Color.Magenta,
                    modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "don't blame yourself ok?",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color(warnaFont)
                    )
                }
            }
        }
    }
}