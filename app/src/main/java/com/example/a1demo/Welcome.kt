package com.example.a1demo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val m = findViewById<TextView>(R.id.messagen)
        val n = findViewById<TextView>(R.id.messageg)

        val text1 = intent.getStringExtra("name")
        val text2 = intent.getStringExtra("gender")

        m.text = text1 ?: "fff"
        n.text = text2 ?: "f"
    }
}