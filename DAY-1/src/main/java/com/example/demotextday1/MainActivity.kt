package com.example.demotextday1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.demotextday1.ui.theme.DemoTextDay1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomText("Demo Text")

        }
    }
}

@Composable
fun CustomText(name: String) {
    Text("Hello Jetpack",
        fontSize = 14.sp,
        color = Color.Blue
    )
}

@Composable
fun StyleText(name: String) {
    Text("Welcome to Jetpack",
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun CenterAlignedText(name: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            "Welcome to Jetpack",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
    }
}

@Composable
fun MultipleStyledText()
{
    Text(buildAnnotatedString {
        append("This is ")
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)){
            append("Bold")
        }
        append(" and this is ")
        withStyle(style= SpanStyle(fontStyle = FontStyle.Italic)){
            append("iatlic.")
        }
    })
}


@Composable
fun OverflowText()
{
 Text(
     text="This is very long text that might not fit in sinlge line might not fit in sinlge line",
     maxLines = 1,
     overflow = TextOverflow.Ellipsis
 )
}

@Preview(showBackground = true)
@Composable
fun CustomTextPreview() {
    CustomText("Android")
}

@Preview(showBackground = true)
@Composable
fun StyleTextPreview() {
    StyleText("Android")
}

//@Preview(showBackground = true)
//@Composable
//fun CenterAlignedTextPreview() {
//    CenterAlignedText("Android")
//}

@Preview(showBackground = true)
@Composable
fun MultipleStyledTextPreview() {
    MultipleStyledText()
}

@Preview(showBackground = true)
@Composable
fun OverflowTextPreview() {
    OverflowText()
}