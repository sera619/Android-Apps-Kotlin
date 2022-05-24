package com.example.codelabone.api

class Dice (private val diceSides: Int){
    fun rollDice(): Int{
        return (1..diceSides).random()
    }
}
