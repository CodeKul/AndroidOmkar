package com.codekul.androidkotlinbatch.second

import android.util.Log

/**
 * Created by aniruddha on 21/6/17.
 */

class MyImpl : MyInterface {
    override val my: Int
                        get() = 10


    private var myHello : Int = 10
            /*get() = 10
            set(value) {field = value}*/


    override fun myAbstract() {
        Log.i("@codekul", "myInterface")
    }

    fun setMyHello(valu : Int) {
        this.myHello = valu
    }

    fun getMyHello() : Int {
        return  this.myHello
    }
}
