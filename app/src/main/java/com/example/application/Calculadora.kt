package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Stack;

class Calculadora : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn10: Button
    lateinit var btn11: Button
    lateinit var btn12: Button
    lateinit var btn13: Button
    lateinit var btn14: Button
    lateinit var btn15: Button
    lateinit var btn16: Button
    lateinit var btn17: Button
    lateinit var btn18: Button
    lateinit var btn19: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn10 = findViewById(R.id.btn10)
        btn11 = findViewById(R.id.btn11)
        btn12 = findViewById(R.id.btn12)
        btn13 = findViewById(R.id.btn13)
        btn14 = findViewById(R.id.btn14)
        btn15 = findViewById(R.id.btn15)
        btn16 = findViewById(R.id.btn16)
        btn17 = findViewById(R.id.btn17)
        btn18 = findViewById(R.id.btn18)
        btn19 = findViewById(R.id.btn19)
        var exp = ""


        btn1.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "1"
            exp = exp + "1"
        }
        btn2.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "2"
            exp = exp + "2"
        }
        btn3.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "3"
            exp = exp + "3"
        }
        btn4.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "+"
            exp = exp + " + "
        }
        btn5.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "4"
            exp = exp + "4"
        }
        btn6.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "5"
            exp = exp + "5"
        }
        btn7.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "6"
            exp = exp + "6"
        }
        btn8.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "-"
            exp = exp + " - "
        }
        btn9.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "7"
            exp = exp + "7"
        }
        btn10.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "8"
            exp = exp + "8"
        }
        btn11.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "9"
            exp = exp + "9"
        }
        btn12.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "*"
            exp = exp + " * "
        }
        btn13.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "0"
            exp = exp + "0"
        }
        btn14.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "."
            exp = exp + "."
        }
        btn15.setOnClickListener {
            var convertido = Convertidor.infixToPostfix(exp)
            var calculadoraa = Calculator()
            var resultado = calculadoraa.Calculo(convertido)
            txtResultado.text = resultado as String
        }
        btn16.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "/"
            exp = exp + " / "
        }
        btn17.setOnClickListener {
            txtResultado.text = ""
            exp = ""
        }
        btn18.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "("
            exp = exp + " ( "
        }
        btn19.setOnClickListener {
            txtResultado.text = txtResultado.text as String + ")"
            exp = exp + " ) "
        }

    }
}