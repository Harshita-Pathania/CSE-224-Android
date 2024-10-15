package com.example.a1demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)

        var btn_url = findViewById<Button>(R.id.btnurl)
        var btn_nav = findViewById<Button>(R.id.btnnav)
        var btn_cam = findViewById<Button>(R.id.btncam)
        var btn_call = findViewById<Button>(R.id.btncall)
        var btn_cont = findViewById<Button>(R.id.btncontacts)
        var btn_gall = findViewById<Button>(R.id.btngallery)
        var btn_dial = findViewById<Button>(R.id.btndialer)

        var btn_test = findViewById<Button>(R.id.test)

        btn_url.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i)
        }

        btn_nav.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com"))
            startActivity(i)
        }

        btn_cam.setOnClickListener {
            val i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i)
        }

        btn_call.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i)
        }

        btn_cont.setOnClickListener {
            val i = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i)
        }

        btn_gall.setOnClickListener {
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.type = "image/*"
            startActivity(i)
        }

        btn_dial.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.setData(Uri.parse("tel:+919871845601"))
            startActivity(i)
        }

        btn_test.setOnClickListener {
        }

    }
}