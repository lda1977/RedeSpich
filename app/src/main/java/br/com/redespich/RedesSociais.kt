package br.com.redespich

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RedesSociais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redes_sociais)

        //////////////////////////////////////////////////////////////
        // Chamada do Button  para acessar a tela RedesSociais
        //////////////////////////////////////////////////////////////
        val myLocal = findViewById<Button>(R.id.btnProximoRedes) as Button
        myLocal.setOnClickListener {
            // Fazendou uso da biblioteca intent
            val Local = Intent(this, Localizacao::class.java).apply {

                // Bloco de comando caso exista
            }
            // Iniciando o intent
            startActivity(Local)
        }

    }
}