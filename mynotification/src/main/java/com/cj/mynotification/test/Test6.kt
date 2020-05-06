package com.cj.mynotification.test

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    println("start ${Thread.currentThread().name}")
    launch {
        println("launch start ${Thread.currentThread().name}")
        delay(1000)
        println("Kotlin Coroutines World!${Thread.currentThread().name}")
        test()
        println("launch end ${Thread.currentThread().name}")
    }
    println("end ${Thread.currentThread().name}")

}

suspend fun test(){
    println("test start ${Thread.currentThread().name}")
    withContext(Dispatchers.Default){
        println("test withContext!${Thread.currentThread().name}")
    }
    println("test end ${Thread.currentThread().name}")
}
