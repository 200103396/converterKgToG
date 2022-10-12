package com.example.converterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollB: Button = findViewById(R.id.button)
        rollB.setOnClickListener { calc() }
    }

    private fun calc() {
   val num: Editable? = findViewById<EditText?>(R.id.dannyi_kg).text
   val g = num.toString()
        val tt = findViewById<TextView?>(R.id.textView)
        val sum = g.toInt() * 1000
        tt.text = "" + sum + " g in " + g + " kg"
    }

}