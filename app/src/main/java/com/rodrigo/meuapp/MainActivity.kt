package com.rodrigo.meuapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var buttonGreet: Button
    private lateinit var textViewGreeting: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGreet = findViewById(R.id.buttonGreet)
        textViewGreeting = findViewById(R.id.textViewGreeting)

        buttonGreet.setOnClickListener(View.OnClickListener {
            greet()
        })
    }

    private fun greet() {
        textViewGreeting.text = "Você, Clicou!"
    }
}
