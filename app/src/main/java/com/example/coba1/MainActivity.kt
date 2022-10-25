package com.example.coba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coba1.ui.theme.Coba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Coba1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Nae-ssi <3")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Anyeong $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Coba1Theme {
        Greeting("Android")
    }
}