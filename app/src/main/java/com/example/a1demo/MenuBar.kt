package com.example.a1demo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar)

        val t = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(t)

    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_menu,menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                R.id.history -> {
                    Toast.makeText(this, "History clicked", Toast.LENGTH_LONG).show()
                    true
                }

                R.id.about -> {
                    Toast.makeText(this, "About clicked", Toast.LENGTH_LONG).show()
                    true
                }

                R.id.settings -> {
                    Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG).show()
                    true
                }

                else -> super.onOptionsItemSelected(item)
            }
        }
}