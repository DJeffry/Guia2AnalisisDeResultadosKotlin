package com.example.discucinderesultados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var numeroPrimero:EditText
lateinit var numeroSegundo:EditText
lateinit var enviar:Button
lateinit var resultado:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numeroPrimero=findViewById(R.id.primerNumero)
        numeroSegundo=findViewById(R.id.segundoNumero)
        enviar=findViewById(R.id.enviar)
        resultado=findViewById(R.id.Resultado)

        enviar.setOnClickListener{
            val num1 = numeroPrimero.text.toString().toFloat()
            val num2 = numeroSegundo.text.toString().toFloat()
            val r = num1 + num2
            resultado.text = r.toString()
        }
    }
}