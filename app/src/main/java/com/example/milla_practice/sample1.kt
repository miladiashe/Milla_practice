package com.example.milla_practice

fun main(){
    helloWorld()

    println(add(17, 24))
}


//1 함수

fun helloWorld(){
    println("안녕세계야")
}

fun add(a : Int, b: Int) : Int{
    return a+b
}
