package com.smithsona2.helloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try{
            val bad = 10/0
        }catch(exception: ArithmeticException){
            Log.e("MainActivity", exception.toString())
        }
    }
}