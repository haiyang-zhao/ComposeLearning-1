package com.zhy.compose.chapter02.app.ui._02_02_Baisc_Components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zhy.compose.chapter02.app.R

@Composable
@Preview
fun TextDemo() {
    Column {
        //指定字符串
        Text(text = "Hello World")
        //指定文字资源
        Text(text = stringResource(id = R.string.app_name))
        Text(
            text = "Hello World \n" + "Goodbye World",
            style = TextStyle(
                fontSize = 25.sp,//字体大小
                fontWeight = FontWeight.Bold,//粗细
                background = Color.Cyan,//背景色
                lineHeight = 35.sp //行高
            )
        )
        Text(
            text = "Hello World",
            style = TextStyle(
                color = Color.Gray,
                letterSpacing = 4.sp //字体间距
            )
        )

        Text(
            text = "Hello World",
            style = TextStyle(
                textDecoration = TextDecoration.LineThrough//删除线
            )
        )

        Text(
            text = "Hello World",
            style = MaterialTheme.typography.titleMedium.copy(fontStyle = FontStyle.Italic)
        )

    }
}