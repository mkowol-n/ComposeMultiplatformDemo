package com.example.common.demo

import kotlinx.coroutines.CoroutineScope

public expect open class BaseViewModel() {
    public val scope: CoroutineScope
}