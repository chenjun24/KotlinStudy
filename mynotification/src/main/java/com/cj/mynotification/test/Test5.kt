package com.cj.mynotification.test

import kotlinx.coroutines.*
import kotlinx.coroutines.test.withTestContext
import kotlin.coroutines.suspendCoroutine

fun main(args: Array<String>){
    println("start ${Thread.currentThread().name}")
//    GlobalScope.launch{
//        delay(1000)
//        println("hello world ${Thread.currentThread().name}")
//    }
    //test()
//    async(){
//
//    }
//    runBlocking {
//        println("runBlocking ${Thread.currentThread().name}")
//
//        println("runBlocking ${Thread.currentThread().name}")
//    }
//    suspendCoroutine{
//
//    }
//    val job = Job()
//   val scope =  CoroutineScope(job)
//    scope.launch {
//        println("launch ${Thread.currentThread().name}")
//    }
    
    println("end ${Thread.currentThread().name}")
}
