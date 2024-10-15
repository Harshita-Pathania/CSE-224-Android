package com.example.a1demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var name = findViewById<EditText>(R.id.editTextText)
        var phone = findViewById<EditText>(R.id.editTextText2)
        var btn = findViewById<Button>(R.id.button)
        var txt = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            var n = name.text.toString()
            var p = phone.text.toString()
            txt.text="Your name is $n and number is $p"

        }

    }
}