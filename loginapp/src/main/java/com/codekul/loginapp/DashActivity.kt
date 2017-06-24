package com.codekul.loginapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DashActivity : AppCompatActivity() {

    companion object {
        val KEY_RES = "res"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)

        val usNm : String? = intent.extras.getString(MainActivity.KEY_NM)
        val pass : String? = intent.extras.getString(MainActivity.KEY_PASS)

        (findViewById(R.id.txtVw) as TextView).text = """ User Name - $usNm  Password - $pass """
    }

    fun onBack(view : View) {

        val processed = (findViewById(R.id.txtVw) as TextView).text.toString()

        val backIntent = Intent()
        backIntent.putExtra(KEY_RES, processed)
        setResult(Activity.RESULT_OK, backIntent)
        finish()
    }
}
