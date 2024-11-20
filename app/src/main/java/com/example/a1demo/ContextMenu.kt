package com.example.a1demo

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContextMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_context_menu)

        var i = findViewById<ImageView>(R.id.imag_con)
        registerForContextMenu(i);
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val j : MenuInflater = menuInflater
        j.inflate(R.menu.context_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        var i = findViewById<ImageView>(R.id.imag_con)

        return when (item.itemId) {
            R.id.change_colour -> {
                i.setColorFilter(Color.CYAN)
                Toast.makeText(this, "Colour changed to green", Toast.LENGTH_LONG).show()
                true
            }

            R.id.rotate -> {
                i.rotation = i.rotation + 45F
                Toast.makeText(this, "Image rotated", Toast.LENGTH_LONG).show()
                true
            }

            else -> super.onContextItemSelected(item)
        }
    }
}