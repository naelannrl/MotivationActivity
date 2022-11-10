package com.example.coba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class DaduActivity : ComponentActivity(){
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
      setContent {
        DiceApp()
      }
   }
}

@Preview(showSystemUi = true)
@Composable
fun DiceApp(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        var diceValue by remember {
            mutableStateOf(1)
        }

        val image = when (diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {
                R.drawable.dice_6
            }
        }

        androidx.compose.foundation.Image(
            painter = painterResource(id = image),
            contentDescription = null
        )

        Spacer(
            modifier = Modifier.height(28.dp)
        )

        Button(
            onClick = {
                diceValue = (listOf<Int>(1,6)).random()
            },
            content = {
                Text(text = "Roll")
            }
        )
    }
}
