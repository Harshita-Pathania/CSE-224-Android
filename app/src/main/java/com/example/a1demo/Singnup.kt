package com.example.a1demo

import android.content.Intent
import android.util.Log
import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Singnup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_singnup)
        val u = findViewById<EditText>(R.id.name)
        val g = findViewById<EditText>(R.id.gender)
        val b = findViewById<Button>(R.id.btn)

        b.setOnClickListener {

            val userName = u.text.toString()
            val userGender = g.text.toString()

            val i = Intent(this, Welcome::class.java)
            i.putExtra("name", userName)
            i.putExtra("gender",userGender)
            Toast.makeText(this,"Data Passed", Toast.LENGTH_LONG).show()
            Log.v(TAG, "Data Passed $userName and $userGender")
            startActivity(i);
        }
    }
}