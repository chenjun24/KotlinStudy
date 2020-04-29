package com.cj.kotlinstudy.test

class Student2(var sno:String,var grade:Int):Person(),Study {
    override fun readBooks() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println(name+" is reading")
    }

    override fun doHomeWork() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println(name+" is doing work")
    }

    init {
        println("sno is :"+sno)
        println("grade is "+grade)
    }
}