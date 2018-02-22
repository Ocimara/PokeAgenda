package com.example.ocimara.pokeagenda.API

import com.example.ocimara.pokeagenda.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPI{
    @GET("/api/v2/pokemon/{numero}/")

    fun buscarPokemon(@Path("numero") numeroPokemon: Int): Call<Pokemon>






}