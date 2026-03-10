package com.example.contador

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botonContador = findViewById<Button>(R.id.btnContador)
        val botonReiniciar = findViewById<Button>(R.id.btnReiniciar)

        if(savedInstanceState != null){
            contador = savedInstanceState.getInt("contador")
            botonContador.text = contador.toString()
        }

        botonContador.setOnClickListener {

            contador++
            botonContador.text = contador.toString()

        }

        botonReiniciar.setOnClickListener {

            contador = 0
            botonContador.text = "0"

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contador", contador)
    }

}