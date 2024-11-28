package com.example.a1demo

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class Localization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_localization)

        val e = findViewById<Button>(R.id.eng)
        val h = findViewById<Button>(R.id.hin)

        e.setOnClickListener {
            setLocale("en")
        }

        h.setOnClickListener {
            setLocale("hi")
        }
    }

    fun setLocale (lang : String){
        val c = resources.configuration.locales.get(0).language
        if(lang != c){
            val l = Locale(lang)
            Locale.setDefault(l)
            val config = Configuration(resources.configuration)
            config.setLocale(l)
            resources.updateConfiguration(config, resources.displayMetrics)
        }
        recreate()
    }
}