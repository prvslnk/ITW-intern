package com.pravas.my_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
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
                        TextWithDivider { NormalText() }
                        TextWithDivider { BoldPurpleText() }
                        TextWithDivider { GradientText() }
                        TextWithDivider { ShadowText() }
                        TextWithDivider { StyledText() }
                        TextWithDivider { OpacityText() }
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

@Composable
fun NormalText() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Hello World", fontSize = 36.sp)
    }
}

@Composable
fun BoldPurpleText() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.DarkGray, CircleShape)
            .clip(CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello World",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFBB86FC)
        )
    }
}

@Composable
fun GradientText() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp))
            .clip(RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello World",
            fontSize = 36.sp,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF98FF98),  // Mint green
                        Color(0xFF00FF00),  // Green
                        Color(0xFA00EF00),  // Greenish shade
                        Color(0xFF00FFFF),  // Cyan
                        Color(0xFF7FFFD4),  // Aquamarine
                        Color(0xFF40E0D0),  // Turquoise
                        Color(0xFF48D1CC),  // Medium turquoise
                        Color(0xFF00CED1),  // Dark turquoise
                        Color(0xFF20B2AA),  // Light sea green
                        Color(0xFF5F9EA0)   // Cadet blue
                    )
                )
            )
        )
    }
}

@Composable
fun ShadowText() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp))
            .clip(RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        val offset = Offset(5.0f, 10.0f)
        Text(
            text = "Hello world!",
            style = TextStyle(
                fontSize = 48.sp,
                shadow = Shadow(
                    color = Color.Blue, offset = offset, blurRadius = 3f
                )
            )
        )
    }
}

@Composable
fun StyledText() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp))
            .clip(RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                    append("H")
                }
                append("ello ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Blue)) {
                    append("W")
                }
                append("orld")
            },
            fontSize = 36.sp
        )
    }
}

@Composable
fun OpacityText() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(4.dp))
            .clip(RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0x80BB86FC))) {
                    append("Hello ")
                }
                withStyle(style = SpanStyle(color = Color(0x800000FF))) {
                    append("World")
                }
            },
            fontSize = 36.sp
        )
    }
}
