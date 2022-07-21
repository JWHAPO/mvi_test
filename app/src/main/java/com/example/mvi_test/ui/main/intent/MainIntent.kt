package com.example.mvi_test.ui.main.intent

sealed class MainIntent {
    object FetchUser : MainIntent()
}
