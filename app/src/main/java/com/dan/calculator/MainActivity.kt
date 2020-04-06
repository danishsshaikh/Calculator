package com.dan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    val a = editNumber1.text.toString().toInt()
//    val b = editNumber2.text.toString().toInt()

    fun sum(@Suppress("UNUSED_PARAMETER")view: View){
        val a = editNumber1.text.toString().toInt()
        val b = editNumber2.text.toString().toInt()
        val result = a + b
        resultText.text = "Result: $result"
    }

    fun minus(@Suppress("UNUSED_PARAMETER")view: View){
        val a = editNumber1.text.toString().toInt()
        val b = editNumber2.text.toString().toInt()
        val result = a - b
        resultText.text = "Result: $result"
    }

    fun multiply(@Suppress("UNUSED_PARAMETER")view: View){
        val a = editNumber1.text.toString().toInt()
        val b = editNumber2.text.toString().toInt()
        val result = a * b
        resultText.text = "Result: $result"
    }

    fun divide(@Suppress("UNUSED_PARAMETER")view: View){
        val a = editNumber1.text.toString().toInt()
        val b = editNumber2.text.toString().toInt()
        val result = a / b
        resultText.text = "Result: $result"
    }
}
