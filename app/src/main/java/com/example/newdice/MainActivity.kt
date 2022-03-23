package com.example.newdice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// the main activity class allows users to roll a dice and view the results
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    //this function allows users to roll the dice and update the screen with the result
    private fun rollDice() {
//    create new dice with 6 sides and roll it
        val month = birthdayMonth(12)
        val day = birthdayDate(30)
        val diceRoll = month.smollRoll()
        val bigDiceRoll = day.bigRoll()
//    update screen with dice roll
        val resultTextView: TextView = findViewById(R.id.numMonth)
        val resultViewTwo: TextView = findViewById(R.id.numDate)
        resultTextView.text = diceRoll.toString()
        resultViewTwo.text = bigDiceRoll.toString()
    }
}

class birthdayMonth(val monthz: Int) {
    //   if numSides was a private val, it would only be accessible in the dice class
    fun smollRoll(): Int {
        return (1..monthz).random()
    }
}

class birthdayDate (val dayz: Int){
    fun bigRoll():Int{
      return (1..dayz).random()
    }
}
