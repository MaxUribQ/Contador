package com.example.contador

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botonContador = findViewById<Button>(R.id.btnContador)
        val botonReiniciar = findViewById<Button>(R.id.btnReiniciar)
        var contador = 0

        botonContador.setOnClickListener {

            contador++
            botonContador.text = contador.toString()

        }

        botonReiniciar.setOnClickListener {

            contador = 0
            botonContador.text = "0"

        }

    }
}