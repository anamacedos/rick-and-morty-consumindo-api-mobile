package br.senai.sp.jandira.rick_morty_api.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//fabrica uma conexao retrofit pra a gnt
class RetrofitFactory {
//val cria constantes e var variaveis
    private val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retrofitFactory = Retrofit
        .Builder() //contrutor da conexao para esse destino(baseurl)
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) //add fabtrica de conversor
        .build()


    //obter o serviço de personagem, quem é o serviço de personagem? CharacterService
    fun GetCharacterService(): CharacterService{
        return retrofitFactory.create(CharacterService::class.java)
    }

}