package com.zhy.compose.chapter02.app.ui._02_01_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Modifier_fillMaxSize() {
    Row {
        Box(
            modifier = Modifier
//                .fillMaxSize()
//                .fillMaxHeight()
//                .width(60.dp)
                .fillMaxWidth()
                .height(60.dp)
                .background(color = Color.Red)//设置纯色背景
        )
    }
}