package com.example.mvi_test.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvi_test.data.api.ApiHelper
import com.example.mvi_test.data.repository.MainRepository
import com.example.mvi_test.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper:ApiHelper): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }


}