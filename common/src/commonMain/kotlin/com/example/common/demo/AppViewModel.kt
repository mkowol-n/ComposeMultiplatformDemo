package com.example.common.demo

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

public class AppViewModel: BaseViewModel() {
    private val repository = AppRepository()
    public val state: MutableStateFlow<Int> = MutableStateFlow(0)

    public fun random() {
        val value = repository.random()
        state.tryEmit(value)
    }

    public fun randomAsync() {
        scope.launch {
            val value = repository.randomAsync()
            state.emit(value)
        }
    }
}