package com.example.a1demo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UploadPhoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_upload_photo)

        val btn = findViewById<Button>(R.id.upload)

        btn.setOnClickListener {
            val b1 = AlertDialog.Builder(this)
            b1.setTitle("Grant Permission")
            b1.setMessage("Allow access to external storage")
            b1.setCancelable(false)
            b1.setPositiveButton("Yes"){_,_ ->
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_LONG).show()
            }
            b1.setNegativeButton("No"){dialog,_ ->
                dialog.dismiss()
                val b2 = AlertDialog.Builder(this)
                b2.setTitle("Try Again")
                b2.setMessage("Grant Permission to proceed further")
                b2.setPositiveButton("Yes"){_,_ ->
                    Toast.makeText(this, "Permission Granted", Toast.LENGTH_LONG).show()
                }
                b2.setNegativeButton("No"){dialog, _ ->
                    dialog.dismiss()
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show()
                }

                b2.create().show()
            }
            b1.create().show()
        }
    }
}