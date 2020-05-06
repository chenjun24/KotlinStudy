package com.cj.myfragment.test

fun main(){
//    StringBuilder().apply {
//        append("start")
//        append("end")
//
//    }
//    test(::a)
//    test { println("hahaha") }
//    test1("heihei"){
//        println(it)
//    }
//    test2(Complex(12.0,13.0)){
//       // plus()
//    }
     val  ss =aa {
         "hello"
     }
    println(ss)
}

fun aa(block:(Int)->String):String{
     return block(2)
}

fun a(){
    println("hello")
}
fun test(f:()->Unit){
   f()
}
fun test1(s:String,f:(String)->Unit){
   f(s)
}
fun test2(c:Complex,f:Complex.()->Unit){
    f(c)
}

inline fun <reified T> aa( a:T):T{

    return a
}
