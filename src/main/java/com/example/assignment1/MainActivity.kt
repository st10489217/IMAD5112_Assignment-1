package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.startButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val suggestionText = findViewById<TextView>(R.id.suggestionText)
        val timeInput = findViewById<EditText>(R.id.timeInput)


        startButton.setOnClickListener {
            val timeOfDay = timeInput.text.toString().trim()
            val mealSuggestion = getMealSuggestion(timeOfDay)
            suggestionText.text = mealSuggestion
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            "Meal Suggestion will appear here".also { suggestionText.text = it }
        }
    }

    private fun getMealSuggestion (time0fDay: String): String {
        return when (time0fDay) {
            "morning" -> {
                "Breakfast: Muesli"
            }
            "mid-morning snack"-> {
                "banana"
            }
            "afternoon lunch" -> {
                "chicken wrap"
            }
            "afternoon snack" -> {
                "oreo biscuit"
            }
            "dinner main" -> {
                "lasagne"
            }
            "after dinner snack" -> {
                "milk tart"
            }
            else -> {
                "Invalid time of day. Please enter Morning, Mid-morning, Afternoon lunch, Afternoon snack, .Dinner main or After dinner snack."
            }
        }

    }
}