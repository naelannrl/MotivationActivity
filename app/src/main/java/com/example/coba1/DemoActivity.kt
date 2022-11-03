package com.example.coba1

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels }
fun getScreenHeight(): Int {
    return  Resources.getSystem().displayMetrics.heightPixels }

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showLogoKpopGroup ()
        }
    }
}

@Preview//(showbackground = true, showSystemU1)
@Composable
fun showLogoKpopGroup(){
    val surfaceWidth = getScreenWidth() * 0.114;
    val surfaceHeight = getScreenHeight() * 0.188;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xffc9b6db),
                modifier = Modifier
                    .size(surfaceWidth.dp, surfaceHeight.dp)
                    .weight(1f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logosvtt),
                        contentDescription = "Seventeen's Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Transparent, CircleShape)
                    )
                    Text(
                        text = stringResource(R.string.Seventeen),
                        fontSize = 19.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center)
                    Text(
                        text = "Pledis Entertainment",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center)
                }
            }
            Surface(
                color = Color(0xff6d9c8f),
                modifier = Modifier
                    .size(surfaceWidth.dp, surfaceHeight.dp)
                    .weight(1f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.btslogo),
                        contentDescription = "BTS's Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Transparent, CircleShape)
                    )
                    Text(
                        text = stringResource(R.string.BTS),
                        fontSize = 19.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "BigHit Entertainment",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffa14242),
                modifier = Modifier
                    .size(surfaceWidth.dp, surfaceHeight.dp)
                    .weight(1f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logopentagon),
                        contentDescription = "Pentagon's Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Transparent, CircleShape)
                    )
                    Text(
                        text = stringResource(R.string.Pentagon),
                        fontSize = 19.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Cube Entertainment",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xffd59890),
                modifier = Modifier
                    .size(surfaceWidth.dp, surfaceHeight.dp)
                    .weight(1f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logoaespa),
                        contentDescription = "Aespa's Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Transparent, CircleShape)
                    )
                    Text(
                        text = stringResource(R.string.Aespa),
                        fontSize = 19.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "SM Entertainment",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff91abc9),
                modifier = Modifier
                    .size(surfaceWidth.dp, surfaceHeight.dp)
                    .weight(1f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logobp),
                        contentDescription = "Blackpink's Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Transparent, CircleShape)
                    )
                    Text(
                        text = stringResource(R.string.Blackpink),
                        fontSize = 19.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "YG Entertainment",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = colorResource(id = R.color.soft_yellow),
                modifier = Modifier
                    .size(surfaceWidth.dp, surfaceHeight.dp)
                    .weight(1f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logotwicee), //disimpan dlm resource agar memudahkan ketika akan mengubah suatu kata yang berulang
                        contentDescription = "Twice's Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Transparent, CircleShape)
                    )
                    Text(
                        text = stringResource(R.string.Twice),
                        fontSize = 19.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "JYP Entertainment",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
