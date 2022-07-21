package com.example.mvi_test.data.api

import com.example.mvi_test.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}