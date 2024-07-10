package com.zhy.compose.chapter02.app.ui._02_01_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Modifier_scope() {
    Row(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red)
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .matchParentSize()
                    .background(Color.Blue)
            )

        }
    }
}


//@LayoutScopeMarker
class AScope {
    fun visitA() {}
}

@LayoutScopeMarker
class BScope {
    fun visitB() {}
}

fun funA(scope: AScope.() -> Unit) {
    scope(AScope())

}

fun funB(scope: BScope.() -> Unit) {
    scope(BScope())
}

fun test() {
    funA {
        funB {
            visitA() // 跨级访问
        }
    }
}


@Composable
@Preview
fun Modifier_Weight() {
    Column(
        modifier = Modifier
            .width(300.dp)
            .height(200.dp)
    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        )
    }
}


interface InfA {
    fun a()
    fun InfB.b()
    fun InfA.a()
}

interface InfB {
    fun b()
}

class AImpl : InfA {
    override fun a() {

    }

    override fun InfA.a() {
        this.a()
    }

    override fun InfB.b() {
        this.b()
    }

}

fun test1() {
    val aImpl = AImpl()
    aImpl.a()
}
