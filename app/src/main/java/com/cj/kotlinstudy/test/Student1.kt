package com.cj.kotlinstudy.test

class Student1(val sno:String,val grade:Int,name:String,age:Int):Person1(name,age) {
    init {
        println("sno is :"+sno)
        println("grade is "+grade)
    }
    constructor(name:String,age: Int):this("",0,name,age)
    constructor():this("",0)
}