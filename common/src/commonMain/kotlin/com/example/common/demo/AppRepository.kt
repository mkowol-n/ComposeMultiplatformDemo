package com.example.common.demo

import kotlinx.coroutines.delay
import kotlin.random.Random

public class AppRepository {
    public fun random(): Int {
        return Random.nextInt(5000)
    }
    public suspend fun randomAsync(): Int {
        delay(2000)
        return Random.nextInt(5000)
    }
}