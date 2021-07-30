package com.example.milla_practice

fun main(){

    //3 String Template

    val answer = "귀요미"

    println("1+1 = $answer")
    println("1+1 = ${answer}2+2=${answer} ")
    //{}이거 쳐주면 뒤에 띄어쓰기 없이도 변수명과 뒤의 스트링을 구분해준다.

    println("150\$ ")


    //주석
    /*
    *이렇게
     */
    // 드래그하고 ctrl+/ 누르면 전체주석! 우와! 정말대단해!




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

    var e : String
    //당장 값을 안 넣을 때는 타입을 알려주자

}


//4. 조건식

fun maxBy(a : Int, b: Int) : Int{
    if(a>b){
        return a
    }
    else{
        return b
    }
}

//위와 같음

fun maxBy2(a: Int, b:Int) = if (a>b) a else b

//오 간단해 대박 삼항연산자 바이바이

fun checkNum(score : Int){
    when(score){
        0 -> println("this is o")
        1 -> println("this is 1")
        2, 3 -> println("뭘까요")
        else -> println("이건아닌듯")
    }
}
//새로워! 놀라워! 약간 스위치같은건데 더 쉽다
