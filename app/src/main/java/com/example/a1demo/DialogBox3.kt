package com.example.a1demo

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class DialogBox3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_box3)

        val btn = findViewById<Button>(R.id.Language)

        btn.setOnClickListener {
            val c_dialog = LayoutInflater.from(this).inflate(R.layout.lang_dialog, null)
            val builder = AlertDialog.Builder(this).setView(c_dialog)

            val l = c_dialog.findViewById<ListView>(R.id.Lst)

            val languages = arrayOf("English", "Hindi", "Spanish", "French", "German")

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
            l.adapter = adapter

            val dialog = builder.create()
            dialog.show()

            l.setOnItemClickListener { _, _, position, _ ->
                val selectedLanguage = languages[position]
                Toast.makeText(this, "Language selected: $selectedLanguage", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }
        }
    }
}
