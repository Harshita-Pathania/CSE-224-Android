package com.example.a1demo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DialogBox2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_box2)
        val sub = findViewById<Button>(R.id.sub)
        sub.setOnClickListener {
            val c_dialog = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            val builder = AlertDialog.Builder(this).setView(c_dialog)
            builder.setPositiveButton("Subscribe") { dialog, _ ->
                val e = c_dialog.findViewById<EditText>(R.id.Email)
                val email = e.text.toString()
                if (email.isNotBlank()) {
                    Toast.makeText(this, "Subscribed with $email", Toast.LENGTH_LONG).show()
                    dialog.dismiss()
                }
                else {
                    Toast.makeText(this, "Enter valid E-mail", Toast.LENGTH_LONG).show()
                }
            }

            builder.setNegativeButton("Cancel") { dialog, _ -> dialog.dismiss() }

            builder.create().show()
        }
    }
}