package com.example.demorowcolumnday1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demorowcolumnday1.ui.theme.DemoRowColumnDay1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnExample()
            RowExample()
        }
    }
}

@Composable
fun ColumnExample()
{
    val scrollState= rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        repeat(100)
        {
            Text(
                text = "Item new"
            )
        }
//        Text(text = "First Item")
//       // Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Fourth Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "First Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Fourth Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "First Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Fourth Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "First Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Fourth Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Fourth Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "First Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "First Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Fourth Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "First Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Second Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Third Item")
//        Spacer(modifier =Modifier.height(16.dp) )
//        Text(text = "Last Item")
//        Spacer(modifier =Modifier.height(16.dp) )
    }
}

@Composable
fun RowExample()
{
    val scrollState = rememberScrollState()
    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(scrollState)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "First Item")
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Second Item")
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Third Item")
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Fourth Item")
        Text(text = "First Item")
        Text(text = "Second Item")
        Text(text = "Third Item")
        Text(text = "Fourth Item")
        Text(text = "First Item")
        Text(text = "Second Item")
        Text(text = "Third Item")
        Text(text = "Fourth Item")
        Text(text = "First Item")
        Text(text = "Second Item")
        Text(text = "Third Item")
        Text(text = "Last Item")
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnExamplePreview() {
    ColumnExample()
}

@Preview(showBackground = true)
@Composable
fun RowExamplePreview() {
    RowExample()
}