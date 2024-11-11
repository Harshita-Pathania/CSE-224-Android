package com.example.a1demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class DialogBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_box)

        val ex = findViewById<Button>(R.id.exit)
        ex.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Rating")
            builder.setCancelable(false)
            builder.setMessage("Proceed to give rating")
            builder.setPositiveButton("Yes") { _, _ ->
                startActivity(Intent(this, Rating::class.java))
            }
            builder.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
            builder.setNeutralButton("Maybe") { dialog, _ ->
                Toast.makeText(this, "You will be reminded later", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }
            builder.create().show()
        }
    }
}
