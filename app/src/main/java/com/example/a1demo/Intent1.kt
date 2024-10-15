package com.example.a1demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent)

        val btn = findViewById<Button>(R.id.login)
        btn.setOnClickListener {
            var i = Intent(this, IntentHome :: class.java)
            startActivity(i)
        }


        val btng = findViewById<Button>(R.id.login_google)
        btng.setOnClickListener {
            val url = "https://www.google.co.in/"
            var j = Intent(Intent.ACTION_VIEW )
            intent.data = Uri.parse(url)
            startActivity(j)
        }
    }
}