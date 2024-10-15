package com.example.a1demo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)

        val snack = findViewById<Button>(R.id.btn)

        snack.setOnClickListener { view ->
            Snackbar.make(view, "This is Snackbar!", Snackbar.LENGTH_LONG).setAction("Update") {
                Toast.makeText(this, "Update was clicked", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}