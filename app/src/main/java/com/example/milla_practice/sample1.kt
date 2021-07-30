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

//2 val vs var
//val = value. 값. 바뀌지 않는 것. var 는 변수
fun test(){
    val a : Int = 10

    //a = 100

    var v : Int = 10

    v = 100

    var tttt = 100
    //이렇게 해도 알아듣는다 타입추론함

    var
}
