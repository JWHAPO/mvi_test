package com.example.mvi_test.data.repository

import com.example.mvi_test.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}