package com.example.common.demo

import kotlinx.coroutines.flow.MutableStateFlow

public class AppViewModel {
    private val repository = AppRepository()
    public val state: MutableStateFlow<Int> = MutableStateFlow(0)

    public fun random() {
        val value = repository.random()
        state.tryEmit(value)
    }
}