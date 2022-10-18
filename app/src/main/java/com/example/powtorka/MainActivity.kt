package com.example.powtorka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.dodaj).setOnClickListener {
            val imie = findViewById<EditText>(R.id.txt).text.toString()
            var pole = findViewById<TextView>(R.id.pole)

            pole.text = pole.text.toString() + " " + imie
        }

        findViewById<Button>(R.id.wyswietl).setOnClickListener {
            val imie = findViewById<EditText>(R.id.txt).text.toString()
            var pole = findViewById<TextView>(R.id.pole)

            pole.text = "Patryk Domaszek"
        }
    }
}