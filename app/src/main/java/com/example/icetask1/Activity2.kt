package com.example.icetask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two) // points to your activity 2 XML

        val timeOfDayEditText = findViewById<EditText>(R.id.timeOfDayEditText)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val timeOfDayTextView = findViewById<TextView>(R.id.timeOfDayTextView)


        // when statement that prints suggestions when the user inputs valid times of day
       confirmButton.setOnClickListener {
           val results =""

           val timeOfDay = timeOfDayEditText.text.toString()  // declaring val timeOfDay to EditText
           when (timeOfDay) {
               "Morning" -> print("Review your notes from yesterday's lecture for 15 minutes")
               "Mid-morning" -> print("Tackle your most difficult assignment or task while your focus is high")
               "Afternoon" -> print("Take a 10-minute break, stretch, and drink some water before continuing")
               "Evening" -> print("Organise your notes and create a to-do list for tomorrow.")
               "Night" -> print("Wind down by reading over your goals and preparing your bag for\n" +
                           "tomorrow.")
               else -> print("Invalid time of day")   // if the user does not input a valid time of day this message will be outputted
           }
           timeOfDayTextView.text = results




       }



        resetButton.setOnClickListener {
        // make resetButton erase all results
            timeOfDayEditText.text.clear()
            timeOfDayTextView.text = ""

        }
    }
}