package com.cj.kotlinstudy.test

import kotlin.math.max

fun main(){
    //var p = Person()
    val a = 10
    //a = a*10
    var c = 20
    c *= 10
    val b = "hehe"
    println("hello world${b}$c")
    val num1 = 30
    val num2 = 40
    val max = largerNumber(num1,num2)
    println("max number is "+max)
    val range = 0..10
    val range1 = 0 until 10
    for (i in 0..10){
        println(i)
    }
    for (i in 0 until 10 step 2){
        println(i)
    }
    for (i in 10 downTo 0){
        println(i)
    }
    val p = Person()
    p.name = "Jack"
    p.age = 20
    p.eat()
    var s1 = Student1("123",5,"jack",20)
    println(s1.sno+"  "+s1.grade)
    s1 = Student1()
    s1 = Student1("",0)

    val s2 = Student2("456",6)
    s2.grade = 7
    println(s2.sno+"  "+s2.grade)
    doStudy(s2)
    //doStudy(null)
    doStudy1(null)
    Singleton.singletonTest()

    val s = if(a != null){
        a
    }else{
        b
    }
    val ss = a?:b

    if(content != null){
        printUppperCase()
    }

    printP(12)
    printP1(str = "hell")
}

var content:String? = "hello"

fun printUppperCase(){
    val upp = content!!.toUpperCase()
    println(upp)
}
fun getTextL(s:String?):Int{
    if(s != null){
        return s.length
    }
    return 0
}
fun getTextL1(s:String?) = s?.length ?: 0

fun doStudy(study: Study){
    study.doHomeWork()
    study.readBooks()
}
fun doStudy1(study: Study?){
    if(study != null){
        study.doHomeWork()
        study.readBooks()
    }
}

fun doStudy2(study: Study?){
    study?.doHomeWork()
    study?.readBooks()

}
fun doStudy3(study: Study?){
    study?.let{stu->
        stu.doHomeWork()
        stu.readBooks()
    }

}
fun doStudy4(study: Study?){
    study?.let{
        it.doHomeWork()
        it.readBooks()
    }

}

fun printP(num:Int,str:String = "hello"){

}
fun printP1(num:Int = 1,str:String){

}

/**
 * 在其他kotlin 类中 直接调用  相当于java 中 静态函数
 */
fun test(){

}

fun funtion():Int{

    return 1
}
fun methodName(p1:Int,p2:Int):Int{
    return 0
}

fun largerNumber(num1:Int,num2:Int):Int{
    return max(num1,num2)
}

fun largerNumber1(num1:Int,num2:Int):Int = max(num1,num2)

fun largerNumber2(num1:Int,num2:Int)= max(num1,num2)

fun largerNumber4(num1:Int,num2:Int):Int{
    var num = 0
    if(num1>num2){
        num = num1
    }else{
        num = num2
    }
    return num
}
fun largerNumber5(num1:Int,num2:Int):Int{
    val num =if(num1>num2){
         num1
    }else{
         num2
    }
    return num
}
fun largerNumber6(num1:Int,num2:Int):Int{
    return if(num1>num2){
        num1
    }else{
        num2
    }
}

fun largerNumber7(num1:Int,num2:Int) = if(num1>num2){ num1}else{ num2}

fun largerNumber8(num1:Int,num2:Int) = if(num1>num2) num1 else num2

fun getScore(name:String) = if(name == "Tom"){86}
 else if(name == "Jim"){
    60
 }else if(name == "Jack"){
    95
}else if(name == "Lily"){
    100
}else{
    0
}
fun getScore1(name:String) = when(name){
    "Tome"->86
    "Jim"->60
    "Jack"->95
    "Lily"->100
    else ->0
}

fun checkNum(num:Number){
    when(num){
        is Int-> println("is int")
        is Double-> println("is double")
        else-> println("not support")
    }
}

fun getScore2(name:String) = when{
    name == "Tome"->86
    name =="Jim"->60
    name =="Jack"->95
    name =="Lily"->100
    else ->0
}

fun getScore3(name:String) = when{
    name.startsWith("Tome")->86
    name =="Jim"->60
    name =="Jack"->95
    name =="Lily"->100
    else ->0
}


