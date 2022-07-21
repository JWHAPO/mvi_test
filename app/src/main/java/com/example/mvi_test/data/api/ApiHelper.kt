package com.example.mvi_test.data.api

import com.example.mvi_test.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}