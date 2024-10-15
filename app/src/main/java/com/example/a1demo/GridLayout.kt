package com.example.a1demo

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GridLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)

        // Initialize ImageButtons
        val a = findViewById<ImageButton>(R.id.imageButton5)
        val b = findViewById<ImageButton>(R.id.imageButton4)
        val c = findViewById<ImageButton>(R.id.imageButton6)
        val d = findViewById<ImageButton>(R.id.imageButton2)

        // Set onClickListeners for each ImageButton
        a.setOnClickListener {
            Toast.makeText(this, "Image 1 clicked", Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener {
            Toast.makeText(this, "Image 2 clicked", Toast.LENGTH_LONG).show()
        }
        c.setOnClickListener {
            Toast.makeText(this, "Image 3 clicked", Toast.LENGTH_LONG).show()
        }
        d.setOnClickListener {
            Toast.makeText(this, "Image 4 clicked", Toast.LENGTH_LONG).show()
        }
    }
}
