package com.example.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        forLooping()




    }

    private fun forLooping(){
        val numberList = mutableListOf(3,5,6,7,9)
        for (number in numberList){
            println(number)
        }

    }






















}