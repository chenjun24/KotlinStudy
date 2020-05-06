package com.cj.mynotification.test

import kotlinx.coroutines.*

fun main(){
    println("main start  ${Thread.currentThread().name}")
    val startTime = System.currentTimeMillis()
    GlobalScope.launch {
     println("codes run in coroutine scope ${Thread.currentThread().name}")
        delay(1500)
        println("codes run in coroutine scope end")
    }
    Thread.sleep(1000)
    runBlocking {
//             println("codes run in coroutine scope ${Thread.currentThread().name}")
//        delay(1500)
//        println("codes run in coroutine scope end")
//        launch {
//            println("launch 1 ${Thread.currentThread().name}")
//            delay(1000)
//            println("launch 1 end")
//        }
//        launch {
//            println("launch 2 ${Thread.currentThread().name}")
//            delay(1000)
//            println("launch 2 end")
//        }
//        repeat(100000){
//            launch {
//                println(". ${Thread.currentThread().name}")
//            }
//        }
    }
//    val end = System.currentTimeMillis()
//    println(end-startTime)
//    val job =GlobalScope.launch {
//
//    }
//    job.cancel()
    println("main end  ${Thread.currentThread().name}")
}

suspend fun printDot(){
    println("printDot . ${Thread.currentThread().name}")
    delay(1000)

}
suspend fun printDot1() = coroutineScope{
    launch {
        println("printDot . ${Thread.currentThread().name}")
        delay(1000)
    }
}