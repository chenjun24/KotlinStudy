package com.cj.mynotification.test

fun<T> T.build(block:T.()->Unit):T{
    block()
    return this
}