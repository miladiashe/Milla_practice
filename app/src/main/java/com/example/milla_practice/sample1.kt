package com.example.milla_practice

fun main(){

    //3 String Template

//    val answer = "귀요미"
//
//    println("1+1 = $answer")
//    println("1+1 = ${answer}2+2=${answer} ")
//    //{}이거 쳐주면 뒤에 띄어쓰기 없이도 변수명과 뒤의 스트링을 구분해준다.
//
//    println("150\$ ")


    //주석
    /*
    *이렇게
     */
    // 드래그하고 ctrl+/ 누르면 전체주석! 우와! 정말대단해!


    //checkNum(2)

    forAndWhile()

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
        2, 3 -> println("2와 3중에 뭘까요")
        else -> println("이건아닌듯")
        // 복수 가능, 다 아니면 else로 빠진다. 함수 안에서는 else 안써도 되는데 변수에 할당할때는 else 꼭 넣어야 한다.
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b = $b")

    when(score){
        in 90..100 -> println("굿")
        in 10 downTo 0 -> println("밷")
        else -> println("ㅆㅆ")
        //오오 이런것도돼!!

    }
}




//새로워! 놀라워! 약간 스위치같은건데 더 쉽다


//Expression vs Statement
//표현식(Expression) 은 뭔가 해서 값을 만들어내는 것. 문장(Statement)은 값을 만드는게 아니라 뭔가를 실행시키거나 한다.
//코틀린의 모든 함수는 Expression
//아무것도 리턴하지 않는 것 같아 보이는 함수는 Unit을 리턴한다.
//자바 같은 경우는 Void가 존재해서 Statement인 함수를 만들 수 있다-> 코틀린은 Void가 없다?!
//자바에선 if를 statement로밖에 사용 못했는데 코틀린에서는 Expression으로 사용이 가능, when도 마찬가지


//Array와 List

//정말 큰 차이점 = 배열은 메모리가 이미 할당이 되어서 사이즈가 정해져있음.
//리스트는 2가지로 나뉨. immutable, mutable 수정 불가능, 가능 바꿀수없는게 그냥 list다.

fun array(){
    val array = arrayOf(1, 2, 3)
    //arrayOf로 초기화한다.

    val list = listOf(1, 2, 3)
    //listOf로 초기화한다.

    //꼭 타입이 같을 필요는 없음. Array도! 그러면 타입이 Any타입이 된다

    //array는 기본적으로 값 변경이 가능. 사이즈만 변경하지 않으면

    //리스트는 어레이와 다르게 인터페이스다<무슨뜻?
    //get으로 가져와 변수에 넣을수만 있지, 직접 들어가 바꾸는건 불가능. set도 없다.

    //컨트롤 누르고 눌러보면 함수 정의로 가진다

    //arraylist: 뮤터블블리스트 일종. 대표적이라고 한다.
    var arrayList = arrayListOf<Int>()

    arrayList.add(10)
    arrayList.add(200)

    //참조하는 주소가 바뀌지 않아서<<<<<< val로 써도 되는것이다.
    //새로운 객체를 만들어서 할당할때는 val로 쓸 수가 없다.(C적 개념?)
}


//반복문

//어레이 리스트를 for문에 사용할 수 있다.

//for, while

fun forAndWhile(){
    val myCharacters = arrayListOf("Alice", "Mica", "Mina")

    for ( name in myCharacters ){
        println("$name 는 내꺼 ")
    }

    for (i in 1..10){
        println("$i 초 후")
    }
}

