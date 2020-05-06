package com.cj.mynotification.test

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    println("main start  ${Thread.currentThread().name}")
    runBlocking {
        coroutineScope {
            launch {
                for (i in 1..10){
                    println("launch . ${Thread.currentThread().name}")
                    delay(1000)
                }
            }
            println("coroutineScope . ${Thread.currentThread().name}")
        }
        println("runBlocking . ${Thread.currentThread().name}")
    }
    println("main end  ${Thread.currentThread().name}")
}