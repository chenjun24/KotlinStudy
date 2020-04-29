package com.cj.kotlinstudy.utils

class StaticUtil {
    fun doAction(){
        println("do something")
    }
    companion object{
        @JvmStatic
        fun doAction2(){
            println("action2")
        }
    }
}