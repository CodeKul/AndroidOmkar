package com.codekul.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    companion object {
        val KEY_NM = "nm"
        val KEY_PASS = "pass"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onOkay(view : View) {
        val ac : KClass<DashActivity> = DashActivity::class
        val cls : Class<DashActivity> = ac.java

        val usNm = (findViewById(R.id.etUsNm) as EditText).text.toString()
        val pass = (findViewById(R.id.etPass) as EditText).text.toString()

        val intent : Intent = Intent(this, cls)
        val bnd : Bundle = Bundle()
        bnd.putString(KEY_NM, usNm)
        bnd.putString(KEY_PASS, pass)
        intent.putExtras(bnd)

        startActivityForResult(intent,1234)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val processed  = data?.extras?.getString(DashActivity.KEY_RES)
        (findViewById(R.id.txtLbl) as TextView).text = processed
    }
}
