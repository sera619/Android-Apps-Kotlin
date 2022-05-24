package com.example.codelabone

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabone.api.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.rollBtn)



        rollBtn.setOnClickListener{
            //val toast = Toast.makeText(this,"Dice rolled!", Toast.LENGTH_SHORT)
            //toast.show()
            luckyNumber()
        }

    }


    private fun luckyNumber(){
        val number = (1..6).random()
        when (rollDice()) {
            number -> updateDice("YOU WIN!\nYou rolled a $number!\nPlay again?", newImage = R.drawable.dice_6)
            1 -> updateDice("So sorry! You rolled a 1.\nThe number was: $number!\nTry again!",R.drawable.dice_1)
            2 -> updateDice("Sadly, you rolled a 2.\nThe number was: $number!\nTry again!", R.drawable.dice_2)
            3 -> updateDice("Unfortunately, you rolled a 3.\nThe number was: $number!\nTry again!", R.drawable.dice_3)
            4 -> updateDice("Unfortunately, you rolled a 4.\nThe number was: $number!\nTry again!", R.drawable.dice_4)
            5 -> updateDice("Don't cry! You rolled a 5.\n The number was: $number!\bTry again!", R.drawable.dice_5)
            6 -> updateDice("Apologies! You rolled a 6.\nThe number was: $number!\nTry again!", R.drawable.dice_6)

        }
    }

    private fun updateDice(newText:String, newImage: Int){
        val mainText: TextView = findViewById(R.id.birthdayName)
        val diceImage: ImageView = findViewById(R.id.diceImage)
        mainText.text = newText
        diceImage.setImageResource(newImage)
    }

    private fun rollDice(): Int {
        val dice = Dice(6)
        return dice.rollDice()
    }

}
