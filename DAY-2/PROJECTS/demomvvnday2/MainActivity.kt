package com.example.demomvvnday2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.demomvvnday2.ui.theme.DemoMVVNDay2Theme
import com.example.demomvvnday2.view.HomePage
import com.example.demomvvnday2.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class]
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()){innerPadding ->
                HomePage(modifier = Modifier.padding(innerPadding), homeViewModel)
            }
        }
    }
}

