package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXSTRA_MESSAGE = "com.example.myfirstapp.EXSTRA_MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view : View){
        val editText = findViewById<EditText>(R.id.editText)
        val userInputValue = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXSTRA_MESSAGE,userInputValue)
        }
        startActivity(intent)
    }
}
