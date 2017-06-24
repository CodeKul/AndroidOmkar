package com.codekul.androidkotlinbatch.second

import android.util.Log

/**
 * Created by aniruddha on 21/6/17.
 */

interface MyInterface {

    val my : Int

    fun myAbstract()

    fun myNormal() {
        Log.i("@codekul", "Normal")
    }
}
