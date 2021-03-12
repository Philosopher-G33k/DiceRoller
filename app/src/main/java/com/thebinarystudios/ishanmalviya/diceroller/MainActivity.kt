package com.thebinarystudios.ishanmalviya.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImageView = findViewById(R.id.dice_image)
        val button: Button = findViewById(R.id.roll_button)
        button.text = "Let's Roll"
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun getRandomNumber() {

    }

    private fun rollDice() {

        val randomInteger = Random().nextInt(6) + 1

        val drawableResource = when (randomInteger) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageView.setImageResource(drawableResource)
    }
}