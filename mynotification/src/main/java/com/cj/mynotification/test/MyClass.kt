package com.cj.mynotification.test

class MyClass<T> {
    fun method(p:T):T{
      return p
    }

    fun<E> m1(p:E):E{

        return p
    }
    fun foo(){
        bar<Int>()
    }
    inline fun <S> bar(){
        println("bar ---")
    }
}