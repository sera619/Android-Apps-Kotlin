package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcButton.setOnClickListener { (calculateTip()) }
    }

    private fun calculateTip() {

        val inputText: String = binding.serviceCosts.text.toString()
        val cost = inputText.toDoubleOrNull()
        /// can also be write as  val cost = inputText.toDoubleOrNull()?: return
        if (cost == null){
            return
        }

        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId){
            R.id.option_20_percent -> 0.20
            R.id.option_18_percent -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage * cost
        if(binding.switch2.isChecked){
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.yourTip.text =  formattedTip.toString()
    }
}