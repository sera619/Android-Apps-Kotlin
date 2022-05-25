package com.example.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationapp.adapter.ItemAdapter
import com.example.affirmationapp.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataset = Datasource().loadAffirmations()
        val recView = findViewById<RecyclerView>(R.id.rec_view)
        recView.adapter = ItemAdapter(this, dataset)
        recView.setHasFixedSize(true)




    }

/**    private fun forLooping(){
        val numberList = mutableListOf(3,5,6,7,9)
        for (number in numberList){
            println(number)
        }

    }*/






















}