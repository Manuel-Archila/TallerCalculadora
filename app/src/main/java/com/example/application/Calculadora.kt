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
            txtResultado.text = txtResultado.text as String + " + "
        }
        btn5.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "4"
        }
        btn6.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "5"
        }
        btn7.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "6"
        }
        btn8.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " - "
        }
        btn9.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "7"
        }
        btn10.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "8"
        }
        btn11.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "9"
        }
        btn12.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " * "
        }
        btn13.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "0"
        }
        btn14.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "."
        }
        btn15.setOnClickListener {
            val expresion = txtResultado.text as String
            val expresiones = expresion.split(" ")
            var resultado = 0.0
            for (index:Int in expresiones.indices){
                if(expresiones[index] == "+"){
                    val num1 = expresiones[index-1].toDouble()
                    val num2 = expresiones[index+1].toDouble()
                    val res = (num1 + num2)
                    resultado += res
                }else if(expresiones[index] == "-"){
                    val num1 = expresiones[index-1].toDouble()
                    val num2 = expresiones[index+1].toDouble()
                    val res = (num1 - num2)
                    resultado += res
                }else if(expresiones[index] == "*") {
                    val num1 = expresiones[index-1].toDouble()
                    val num2 = expresiones[index+1].toDouble()
                    val res = (num1 * num2)
                    resultado += res
                }else if(expresiones[index] == "/"){
                    val num1 = expresiones[index-1].toDouble()
                    val num2 = expresiones[index+1].toDouble()
                    val res = (num1 / num2)
                    resultado += res
                }
            }
            txtResultado.text = resultado.toString()
        }
        btn16.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " / "
        }
        btn17.setOnClickListener {
            txtResultado.text = ""
        }

    }
}