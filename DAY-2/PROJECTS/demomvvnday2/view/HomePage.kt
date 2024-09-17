package com.example.demomvvnday2.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.example.demomvvnday2.viewmodel.HomeViewModel

@Composable
fun HomePage(modifier: Modifier=Modifier, viewModel: HomeViewModel)
{
    val userData = viewModel.userData.observeAsState()
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Button(onClick = {viewModel.getUserData()}) {
            Text(text = "Get Data")
        }
        userData.value?.name?.let{
            Text(text = "Name: $it")
        }
        userData.value?.age?.let{
            Text(text = "Age: $it")
        }
    }

}