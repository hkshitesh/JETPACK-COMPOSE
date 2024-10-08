package com.example.demostatehoistingday3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demostatehoistingday3.ui.theme.DemoStateHoistingDay3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var count by mutableStateOf(0)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp) ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CounterDisplay(count)
                Spacer(modifier = Modifier.height(16.dp))
                CounterButtons(
                    onIncrement = {count++},
                    onDecrement = {if(count>0)count--}
                )
            }

        }
    }
}


@Composable
fun HoistingCounterApp()
{
    var count by remember { mutableStateOf(0) }

}


@Composable
fun CounterDisplay(count: Int)
{
    Text(text= "Counter: $count", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun CounterButtons(onIncrement:()->Unit, onDecrement:()->Unit)
{
    Row {
        Button(onClick = onIncrement, modifier = Modifier.padding(end=8.dp)) {
            Text(text = "Increment")
        }
        Button(onClick = onDecrement) {
            Text(text = "Decrement")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HoistingCounterAppPreview()
{
    HoistingCounterApp()
}