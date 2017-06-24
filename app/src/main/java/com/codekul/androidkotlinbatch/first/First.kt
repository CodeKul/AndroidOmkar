package com.codekul.androidkotlinbatch.first

import android.util.Log

/**
 * Created by aniruddha on 21/6/17.
 */

class First {

    fun first() {
        var name: String? = "hello"
        name = null
//        name = "ji"

        var cost = "a43243"
//        cost = 4654

        val car1  = Car("")

        val car2  = Car("")

        var bmw = Bmw()

        val carBmw : Car = Bmw()

        // val bmwCar : Bmw = Car("") as Bmw

        val num : Int = "12".toInt()

        val num1 : Int = 1234

        val num2 : Int = 1234

        Log.i("@codekul",""" === ${car1 === car2} == ${car1 == car2} """)
    }
}

open class Car(st: String) {

    init {

    }

    fun hello(): String? {
        return null
    }

    fun work() {
        val car : Car? = Car("")
        val data = car?.hello()
    }
}

class Bmw : Car("")

