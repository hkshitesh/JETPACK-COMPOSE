package com.example.demolazycollayrowday3

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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import com.example.demolazycollayrowday3.ui.theme.DemoLazyColLayRowDay3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnExample()
        }
    }
}

@Composable
fun ColumnExample()
{
    val itemList = listOf("item 1", "item 2")
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(150) {
            Text(text = "My Item 1")
        }

    }
}

@Composable
fun RowExample()
{

    val itemsList = listOf("Item A", "Item B", "Item C", "Item D", "Item E", "Item F","Item A", "Item B", "Item C", "Item D", "Item E", "Item F")

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        items(itemsList) { item ->
            Text(text = item, modifier = Modifier.padding(8.dp))
        }
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