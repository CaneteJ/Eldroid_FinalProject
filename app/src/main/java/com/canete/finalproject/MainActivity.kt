package com.canete.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var buttonAddSession: Button
    private lateinit var buttonEditSession: Button
    private lateinit var buttonProgressTracker: Button
    private lateinit var buttonSetStudyGoals: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView) // Make sure the ID matches the TextView ID in your XML
        buttonAddSession = findViewById(R.id.buttonAddSession)
        buttonEditSession = findViewById(R.id.buttonEditSession)
        buttonProgressTracker = findViewById(R.id.buttonProgressTracker)
        buttonSetStudyGoals = findViewById(R.id.buttonSetStudyGoals)


        buttonAddSession.setOnClickListener {
            // Intent to navigate to the AddSessionActivity
            val intent = Intent(this, AddSessionActivity::class.java)
            startActivity(intent)
        }

        // Set up onClickListeners for the other buttons similarly as needed
        // For example:
        buttonEditSession.setOnClickListener {
            // Intent to navigate to the EditSessionActivity
            val intent = Intent(this, EditSessionActivity::class.java)
            startActivity(intent)
        }


        buttonAddSession.setOnClickListener {
            // Create an Intent to navigate to the AddSessionActivity
            val intent = Intent(this, AddSessionActivity::class.java)
            startActivity(intent)
        }

        buttonEditSession.setOnClickListener {
            // Intent to navigate to the EditSessionActivity
            val intent = Intent(this, EditSessionActivity::class.java)
            startActivity(intent)
        }

        buttonProgressTracker.setOnClickListener {
            // Intent to navigate to the ProgressTrackerActivity
            val intent = Intent(this, ProgressTrackerActivity::class.java)
            startActivity(intent)
        }

        buttonSetStudyGoals.setOnClickListener {
            // Intent to navigate to the SetStudyGoalsActivity
            val intent = Intent(this, SetStudyGoalsActivity::class.java)
            startActivity(intent)
        }
    }
}