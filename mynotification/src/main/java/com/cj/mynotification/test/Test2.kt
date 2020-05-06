package com.cj.mynotification.test

import kotlinx.coroutines.*

fun main(){
//    val job = Job()
//    val scope = CoroutineScope(job)
//    scope.launch {
//
//    }
//    job.cancel()
   runBlocking {
//       val result1 = async {
//           delay(1000)
//           5+5
//       }.await()
//       val result2 = async {
//           delay(1000)
//           4+5
//       }.await()
//       println("${result1+ result2}")
       val deferred1 = async {
           delay(1000)
           5+5
       }
       val deferred2 = async {
           delay(1000)
           4+5
       }
       println("${deferred1.await()+ deferred2.await()}")
   }
}