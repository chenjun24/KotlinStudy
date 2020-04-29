package com.cj.kotlinstudy.test

import androidx.lifecycle.Transformations.map
import java.lang.StringBuilder

fun main(){
    val list = ArrayList<String>()
    list.add("apple")
    list.add("banana")
    list.add("orange")
    list.add("pear")
    list.add("grape")

    val list1 = listOf("apple","banana","orange","pear","grape")
    val lambda = {fruit:String->fruit.length}
   // val max1 = list1.maxBy(lambda)
    val max1 = list1.maxBy({fruit:String->fruit.length})
    val max2 = list1.maxBy(){fruit:String->fruit.length}
    val max3 = list1.maxBy{fruit:String->fruit.length}
    val max4 = list1.maxBy{fruit->fruit.length}
    val max5 = list1.maxBy{it.length}
    //val maxLength = list1.maxBy { it.length }
    val newList = list1.filter { it.length <=5 }
        .map{it.toUpperCase()}
    val b1 = list1.any { it.length<=5 }
    val b2 = list1.all { it.length<=5 }

   for (fruit in newList){
       println(fruit)
   }
    val list2 = mutableListOf("apple","banana","orange","pear","grape")
    list2.add("watermelon")
//    for (fruit in list){
//        println(fruit)
//    }
//    for (fruit in list1){
//        println(fruit)
//    }

//    for (fruit in list2){
//        println(fruit)
//    }

    val result = with(StringBuilder()){
        append("start eating fruit")
        for (fruit in list2){
            append(fruit).append("\n")
        }
        append("eat all")
        toString()
    }

    val result1 = StringBuilder().run {
        append("start eating fruit")
        for (fruit in list2){
            append(fruit).append("\n")
        }
        append("eat all")
        toString()
    }

    val result3 = StringBuilder().apply {
        append("start eating fruit")
        for (fruit in list2){
            append(fruit).append("\n")
        }
        append("eat all")
    }

    val map = HashMap<String,Int>()
    map.put("apple",1)
    map.put("banana",2)
    map.put("orange",3)
    map.put("pear",4)
    map.put("grape",5)

    val map1 = HashMap<String,Int>()
    map1["apple"] = 1
    map1["banana"] = 2
    map1["orange"] = 3
    map1["pear"] = 4
    map1["grape"] = 5

    val map2 = mapOf("apple" to 1,"banana" to 2,"orange" to 3,"pear" to 4,"grape" to 5)

    for ((fruit,number) in map2){
        println(fruit+"  "+number)
    }

    Thread(object :Runnable{//匿名内部类
        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            println("thread is running")
        }
    }).start()
    Thread{
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            println("thread is running")
    }.start()

}