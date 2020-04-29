package com.cj.myfragment.test

class Complex(var real:Double,var imagnary:Double) {
    operator fun plus(other:Complex) = Complex(real+other.real,imagnary+other.imagnary)
}