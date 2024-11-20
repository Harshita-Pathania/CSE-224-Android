package com.example.a1demo

import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PopupMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_popup_menu)
        
        val p = findViewById<Button>(R.id.btnn)
        p.setOnClickListener { 
            val p2 = PopupMenu(this, p)
            val m: MenuInflater = p2.menuInflater
            m.inflate(R.menu.popup_menu, p2.menu)

            p2.setOnMenuItemClickListener { item : MenuItem ->
                when (item.itemId) {
                    R.id.det -> {
                        Toast.makeText(this, "Display Details", Toast.LENGTH_LONG).show()
                        true
                    }

                    R.id.share -> {
                        Toast.makeText(this, "Details shared", Toast.LENGTH_LONG).show()
                        true
                    }

                    else -> false
                }
            }

            p2.show()
        }
    }
}