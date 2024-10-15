package com.example.a1demo

import android.os.Bundle
import android.util.Log
import android.content.ContentValues.TAG
import android.nfc.Tag
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log)
        var btnlog = findViewById<Button>(R.id.btn_log)
        btnlog.setOnClickListener {
            Log.v(TAG, "Verbose log: lowest priority, detailed entry, no use during production.")
            Log.d(TAG, "Debug log: highest priority, this is used to debug the app.")
            Log.i(TAG, "Info log: moderate level importance, they give information.")
            Log.w(TAG, "Warning log: This is a warning message for unexpected behaviour.")
        }
    }
}