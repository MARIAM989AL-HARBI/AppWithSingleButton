package com.example.appwithsinglebuttonbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val editText =findViewById<EditText>(R.id.editText)
            val output =findViewById<TextView>(R.id.output)

            val ADD=findViewById<Button>(R.id.add)

           ADD.setOnClickListener {
                output.text =editText.text.toString()
            }
        }
    }


