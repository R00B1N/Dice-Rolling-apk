package com.android.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Relacionando cada objeto con su elemento visual.
        val rollButton: Button = findViewById(R.id.button)

        //agregando una accion cuando el boton sea presionado.
        rollButton.setOnClickListener {
            rollingDice()
        }
        /*rollButton.setOnClickListener {
            // llamar a la funcion rollDice.
            rollDice()
        }*/

    }
    //creando la funcion para cambiar la imagen cada vez que el boton sea presionado.
    private fun rollingDice() {
        val imagenView: ImageView = findViewById(R.id.imageView)
        val randomNumber = (1..6).random() // generar el numero aleatorio.
        when (randomNumber){
            // estableciendo imagenes segun el numero generado.
            1 -> imagenView.setImageResource(R.drawable.dice_1)
            2 -> imagenView.setImageResource(R.drawable.dice_2)
            3 -> imagenView.setImageResource(R.drawable.dice_3)
            4 -> imagenView.setImageResource(R.drawable.dice_4)
            5 -> imagenView.setImageResource(R.drawable.dice_5)
            else -> imagenView.setImageResource(R.drawable.dice_6)
        }
    }
    // funcion creada para generar el numero aleatorio.
    /*private fun rollDice() {
        var randomNumber = (1..6).random()
        var number = randomNumber.toString()
        val txtView: TextView = findViewById(R.id.textView)
        // estableciendole al textView el numero generado pero en formato String.
        txtView.text = number
    }*/
}