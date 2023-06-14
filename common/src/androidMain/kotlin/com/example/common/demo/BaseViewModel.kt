package com.example.common.demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

public actual open class BaseViewModel: ViewModel() {
    public actual val scope: CoroutineScope = viewModelScope
}