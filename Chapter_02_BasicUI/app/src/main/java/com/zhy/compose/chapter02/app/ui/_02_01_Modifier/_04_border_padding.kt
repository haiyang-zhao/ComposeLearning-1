package com.zhy.compose.chapter02.app.ui._02_01_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Modifier_Border_Padding() {
    Box(
        modifier = Modifier
            .background(Color.Green)
            .padding(10.dp) // 外间隙
            .border(2.dp, Color.Red, RoundedCornerShape(2.dp)) //边框
            .background(Color.Yellow)
            .padding(5.dp) //内间隙
    ) {
        Spacer(
            modifier = Modifier
                .size(width = 100.dp, height = 10.dp)
                .background(Color.Blue)
        )
    }
}