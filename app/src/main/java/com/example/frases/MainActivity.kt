package com.example.frases

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity: AppCompatActivity(), View.OnClickListener {

    val frasesCoach: List<String> = ArrayList(Arrays.asList("Imagine uma nova história para sua vida e acredite nela.",
        "Para sempre é composto de agoras.",
        "Para ter o que nunca teve, faça o que nunca fez.",
        "A vida não é sobre ter, é sobre dar e ser."))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numero = Math.random() * frasesCoach.size
        var fraseAtual = frasesCoach[numero.toInt()]

        frases.text=" ${frasesCoach[numero.toInt()]}"
        trocar.setOnClickListener {

            do {
                numero = Math.random() * 4
            }while (fraseAtual.equals(frasesCoach[numero.toInt()]))
            fraseAtual= frasesCoach[numero.toInt()]
            frases.text=" ${frasesCoach[numero.toInt()]}"
        }
    }

    override fun onClick(v: View?) {
    }
}