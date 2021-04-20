package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)

        btn1.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "1"
        }
        btn2.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "2"
        }
        btn3.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "3"
        }
        btn4.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "4"
        }
    }
}