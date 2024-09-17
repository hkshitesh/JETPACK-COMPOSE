package com.example.demomvvnday2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demomvvnday2.model.UserData
import com.example.demomvvnday2.model.UserRepository
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope

class HomeViewModel: ViewModel(){

    val userRepository: UserRepository = UserRepository()
    private val _userdata = MutableLiveData<UserData>()
    val userData: LiveData<UserData> = _userdata

    fun getUserData()
    {
        viewModelScope.launch {
            val userResult = userRepository.fetchUserData()
            _userdata.postValue(userResult)
        }
    }
}