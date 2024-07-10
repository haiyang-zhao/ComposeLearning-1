package com.zhy.compose.chapter02.app.ui._02_01_Modifier

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zhy.compose.chapter02.app.R


@Composable
@Preview
fun ModifierSize() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp) //width和height同时设置为60dp
                .clip(CircleShape) //将图片裁剪为圆形
        )
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)// width和height同时设置为100dp
                .clip(CircleShape)

        )
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(width = 100.dp, height = 200.dp)// width和height单独设置
        )
    }
}


@Composable
//@Preview
fun ModifierBg1() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            Modifier
                .size(300.dp)
                .background(Color.Red)
                .padding(10.dp)
                .background(Color.Blue)
        )
    }

}

@Composable
//@Preview
fun ModifierBg2() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            Modifier
                .size(300.dp)
                .background(Color.Red)
                .background(Color.Blue)
                .padding(10.dp)
        )
    }
}