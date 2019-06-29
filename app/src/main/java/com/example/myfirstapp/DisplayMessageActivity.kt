package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val inputText = intent.getStringExtra(EXSTRA_MESSAGE)

        val txtView = findViewById<TextView>(R.id.textView).apply{
            text = inputText
        }
    }
}
