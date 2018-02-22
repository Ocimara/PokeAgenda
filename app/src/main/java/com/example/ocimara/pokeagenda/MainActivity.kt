package com.example.ocimara.pokeagenda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btPesquisa.setOnClickListener {
            pesquisarPokemon()

        }

    }

    fun pesquisarPokemon()
    {



    }
}
