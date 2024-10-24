package com.example.a1demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AppChooser : AppCompatActivity() {

    private val quotes = arrayOf(
        "Good Morning", "Good Noon", "Good Evening",
        "Good Night", "Have a Lovely Day", "Sweet Dreams"
    )
    private var selectedQuoteIndex: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val shareButton = findViewById<Button>(R.id.share)

        // Set listener for radio group selection
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            selectedQuoteIndex = when (checkedId) {
                R.id.radio1 -> 0
                R.id.radio2 -> 1
                R.id.radio3 -> 2
                R.id.radio4 -> 3
                R.id.radio5 -> 4
                R.id.radio6 -> 5
                else -> -1
            }
        }

        // Set listener for share button
        shareButton.setOnClickListener {
            if (selectedQuoteIndex != -1) {
                share(quotes[selectedQuoteIndex])
            } else {
                Toast.makeText(this, "Please select a quote", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun share(message: String) {
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooserIntent = Intent.createChooser(intent, "Share via")
        startActivity(chooserIntent)
    }
}
