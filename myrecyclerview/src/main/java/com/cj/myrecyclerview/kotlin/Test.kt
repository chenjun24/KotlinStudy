package com.cj.myrecyclerview.kotlin

import kotlin.contracts.Returns

fun main(){
    println(a(::b))
    println(a(::c))
    val s = ::d
    val y = s
    println(a(s))
    val sum = {x:Int,y:Int->x+y}
    a({acc:Int-> "hello"})
    a(){acc:Int-> "hello"}
    a{acc:Int-> "hello"}
    a{ "hello"}
    println(b(2))
    println(c(3))
    println((::b)(2))
    println((::b).invoke(2))
    //println(b.invoke(2))
    a(fun(p:Int):String{
        return p.toString()
    })
    val f = fun(p:Int):String{
        return p.toString()
    }
    val f1 = { p:Int ->
         p.toString()
     }
//    val f2 = {
//         it.toString()
//    }
    val f3 : (Int)->String = {
         it.toString()
    }


}


fun a(block:(Int)->String):String{
    return block(1)
}

fun b(v:Int):String{
    return v.toString()
}
fun c(v:Int):String{
    return "hello"
}
fun d(v:Int):String{
    return "hei"
}
//fun e(v:Int):(Int)->Unit{
//
//}

