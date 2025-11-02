package com.example.eventpracticeapp

import android.os.Bundle
import android.view.View // <-- Import the View class
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.card.MaterialCardView // <-- Import MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val outputTextView = findViewById<TextView>(R.id.outputTextView)

        // 1. Get a reference to the card view
        val outputCardView = findViewById<MaterialCardView>(R.id.outputCardView)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val ageString = ageEditText.text.toString()

            if (name.isNotEmpty() && ageString.isNotEmpty()) {
                try {
                    val age = ageString.toInt()
                    outputTextView.text = "Name: $name, Age: $age"

                    // 2. Make the card visible
                    outputCardView.visibility = View.VISIBLE

                } catch (e: NumberFormatException) {
                    Toast.makeText(this, R.string.invalid_age_input, Toast.LENGTH_SHORT).show()
                    // Optionally hide the card if input is bad
                    outputCardView.visibility = View.GONE
                }
            } else {
                Toast.makeText(this, R.string.fill_all_fields, Toast.LENGTH_SHORT).show()
                // Optionally hide the card if fields are empty
                outputCardView.visibility = View.GONE
            }
        }
    }
}
