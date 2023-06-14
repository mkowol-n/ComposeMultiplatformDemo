package com.example.common.demo

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

public actual open class BaseViewModel {
    public actual val scope: CoroutineScope = CoroutineScope(Dispatchers.Default)
}