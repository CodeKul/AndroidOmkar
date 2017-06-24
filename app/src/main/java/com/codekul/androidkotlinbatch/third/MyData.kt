package com.codekul.androidkotlinbatch.third

/**
 * Created by aniruddha on 22/6/17.
 */

class MyData {


    fun nine() {

        fun eight() {

        }
    }

    fun seven() {

        val my: Int = 10;

        fun Int.shl(x: Int, y: Int): Int {
            return x * y
        }

        1 shl 2
        2.shl(3, 5)
    }

    fun my(): (va: String) -> String {
        return { "hello" }
    }

    fun methPara(nm : Int, fn : (h : String) -> String) {
        print("hello")

        val s = fn("hello")
    }

    fun getPara( fn : () -> Int ) {
        fn()

    }

    val six : () -> Int = { 10 }
}

fun main(args: Array<String>) {

    MyData().nine()
    fun MyData.nine(n: Int) {

    }

    MyData().nine(12)

    val un : (va: String) -> String = MyData().my()
    var u : String = MyData().my().invoke("")

    MyData().six()

    MyData().methPara (10, {
        "Hello"
    })

    MyData().methPara (10) { "returning" }
    MyData().methPara(10, fun(nm : String) = "" )
}
