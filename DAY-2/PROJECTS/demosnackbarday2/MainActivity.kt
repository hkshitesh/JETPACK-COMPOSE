package com.example.demosnackbarday2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demosnackbarday2.ui.theme.DemoSnackBarDay2Theme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SnackBarExample()

        }
    }
}


@Composable
fun SnackBarExample()
{
    val snackbarHostState = remember {SnackbarHostState()}
    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        content = {padding ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ){
                Button(onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar(
                            message = "This is My SnackBar!",
                            actionLabel = "Dismiss"
                        )
                    }
                },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Show SnackBar")
                }
            }

        }
    ) 
}

@Preview(showBackground = true)
@Composable
fun SnackBarExamplePreview()
{
    SnackBarExample()
}