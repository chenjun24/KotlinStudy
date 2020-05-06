package com.cj.mynotification.test

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    runBlocking {
        val re = withContext(Dispatchers.Default){
            println("withContext  ${Thread.currentThread().name}")
            5+5

        }
        println(re)
    }
}