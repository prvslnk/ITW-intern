package com.pravas.my_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pravas.my_app.ui.theme.themesty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            themesty {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        LayoutDemo()
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("Application Lifecycle is in Start state")
    }

    override fun onResume() {
        super.onResume()
        println("Application Lifecycle is in Resume state")
    }

    override fun onPause() {
        super.onPause()
        println("Application Lifecycle is in Pause state")
    }

    override fun onStop() {
        super.onStop()
        println("Application Lifecycle is in Stop state")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Application Lifecycle is in Destroy state")
    }
}

@Composable
fun LayoutDemo() {
    val colorScheme = MaterialTheme.colorScheme

    // Box Layout
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(colorScheme.primary)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box Layout", fontSize = 24.sp, color = colorScheme.onPrimary)
    }

    Spacer(modifier = Modifier.height(16.dp))

    // Row Layout
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(colorScheme.secondary)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Row Item 1", fontSize = 18.sp, color = colorScheme.onSecondary)
        Text(text = "Row Item 2", fontSize = 18.sp, color = colorScheme.onSecondary)
        Text(text = "Row Item 3", fontSize = 18.sp, color = colorScheme.onSecondary)
    }

    Spacer(modifier = Modifier.height(16.dp))

    // Column Layout
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(colorScheme.surface)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Column Item 1", fontSize = 18.sp, color = colorScheme.onSurface)
        Text(text = "Column Item 2", fontSize = 18.sp, color = colorScheme.onSurface)
        Text(text = "Column Item 3", fontSize = 18.sp, color = colorScheme.onSurface)
    }

    Spacer(modifier = Modifier.height(16.dp))

    // Complex Box Layout
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(colorScheme.background)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.TopStart
    ) {
        Text(text = "Top Start", modifier = Modifier.align(Alignment.TopStart), fontSize = 18.sp, color = colorScheme.onBackground)
        Text(text = "Top End", modifier = Modifier.align(Alignment.TopEnd), fontSize = 18.sp, color = colorScheme.onBackground)
        Text(text = "Bottom Start", modifier = Modifier.align(Alignment.BottomStart), fontSize = 18.sp, color = colorScheme.onBackground)
        Text(text = "Bottom End", modifier = Modifier.align(Alignment.BottomEnd), fontSize = 18.sp, color = colorScheme.onBackground)
        Text(text = "Center", modifier = Modifier.align(Alignment.Center), fontSize = 18.sp, color = colorScheme.onBackground)
    }
}

@Composable
fun TextWithDivider(content: @Composable () -> Unit) {
    Column {
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 3.dp),
            thickness = 2.dp,
            color = Color.DarkGray
        )
        content()
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 3.dp),
            thickness = 2.dp,
            color = Color.DarkGray
        )
    }
}

@Composable
fun HorizontalDivider(
    modifier: Modifier = Modifier,
    color: Color = Color.Black,
    thickness: androidx.compose.ui.unit.Dp = 1.dp
) {
    Box(
        modifier
            .fillMaxWidth()
            .height(thickness)
            .background(color = color)
    )
}
