package com.example.demomvvnday2.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun fetchUserData(): UserData{
        delay(2000)
        return UserData("Bob", 35)
    }
}