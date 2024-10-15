package com.example.a1demo

import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Pizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pizza)

        // Size options
        val reg = findViewById<RadioButton>(R.id.radioButton5)
        val med = findViewById<RadioButton>(R.id.radioButton4)
        val large = findViewById<RadioButton>(R.id.radioButton3)

        reg.setOnClickListener {
            Toast.makeText(this, "Regular size pizza selected", Toast.LENGTH_LONG).show()
        }
        med.setOnClickListener {
            Toast.makeText(this, "Medium size pizza selected", Toast.LENGTH_LONG).show()
        }
        large.setOnClickListener {
            Toast.makeText(this, "Large size pizza selected", Toast.LENGTH_LONG).show()
        }

        // Toppings options
        val tomato = findViewById<CheckBox>(R.id.checkBox)
        val onion = findViewById<CheckBox>(R.id.checkBox2)
        val mushroom = findViewById<CheckBox>(R.id.checkBox3)
        val corn = findViewById<CheckBox>(R.id.checkBox4)
        val jalepeno = findViewById<CheckBox>(R.id.checkBox5)

        tomato.setOnClickListener {
            Toast.makeText(this, "Tomato topping selected", Toast.LENGTH_LONG).show()
        }
        onion.setOnClickListener {
            Toast.makeText(this, "Onion topping selected", Toast.LENGTH_LONG).show()
        }
        mushroom.setOnClickListener {
            Toast.makeText(this, "Mushroom topping selected", Toast.LENGTH_LONG).show()
        }
        corn.setOnClickListener {
            Toast.makeText(this, "Corn topping selected", Toast.LENGTH_LONG).show()
        }
        jalepeno.setOnClickListener {
            Toast.makeText(this, "Jalepeno topping selected", Toast.LENGTH_LONG).show()
        }

        // Cheese options
        val cheeseRegular = findViewById<RadioButton>(R.id.radioButton8)
        val cheeseExtra = findViewById<RadioButton>(R.id.radioButton6)
        val cheeseBurst = findViewById<RadioButton>(R.id.radioButton7)

        cheeseRegular.setOnClickListener {
            Toast.makeText(this, "Regular cheese selected", Toast.LENGTH_LONG).show()
        }
        cheeseExtra.setOnClickListener {
            Toast.makeText(this, "Extra cheese selected", Toast.LENGTH_LONG).show()
        }
        cheeseBurst.setOnClickListener {
            Toast.makeText(this, "Cheese burst selected", Toast.LENGTH_LONG).show()
        }

        // Add-ons options
        val garlicBread = findViewById<CheckBox>(R.id.checkBox6)
        val pasta = findViewById<CheckBox>(R.id.checkBox7)
        val mousse = findViewById<CheckBox>(R.id.checkBox8)

        garlicBread.setOnClickListener {
            Toast.makeText(this, "Garlic bread added", Toast.LENGTH_LONG).show()
        }
        pasta.setOnClickListener {
            Toast.makeText(this, "Pasta added", Toast.LENGTH_LONG).show()
        }
        mousse.setOnClickListener {
            Toast.makeText(this, "Chocolate Mousse added", Toast.LENGTH_LONG).show()
        }
    }
}
