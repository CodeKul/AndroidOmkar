package com.codekul.androidkotlinbatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.codekul.androidkotlinbatch.second.BPLTv
import com.codekul.androidkotlinbatch.second.MyImpl
import com.codekul.androidkotlinbatch.second.MyInterface
import com.codekul.androidkotlinbatch.second.Tv

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inf: MyInterface = MyImpl()

        inf.myNormal()
        inf.myAbstract()

        val impl : MyImpl = MyImpl();
        impl.setMyHello(10)
        Log.i("@codekul", """ ${impl.getMyHello()} """)

        val tv : Tv = BPLTv()
        tv.tv = 10
    }
}





