package com.example.a1demo

//import Snackbar2
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class College : AppCompatActivity() {

    private lateinit var img: ImageView
    private lateinit var txt: TextView
    private lateinit var detailTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_college)

        img = findViewById(R.id.img)
        txt = findViewById(R.id.txt)
        detailTxt = findViewById(R.id.detail)
        var homeButton = findViewById<ImageButton>(R.id.home)

        val imageResId = intent.getIntExtra("imageResId", -1)
        val text = intent.getStringExtra("text")
        val detail = intent.getStringExtra("detail")

        if (imageResId != -1) {
            img.setImageResource(imageResId)
        }
        txt.text = text ?: "No data"
        detailTxt.text = detail ?: "No details available"


        homeButton.setOnClickListener {
            val intent = Intent(this, Snackbar2 ::class.java)
            startActivity(intent)
            finish()
        }

    }
}