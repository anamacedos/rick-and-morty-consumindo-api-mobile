package br.senai.sp.jandira.rick_morty_api.service

import br.senai.sp.jandira.rick_morty_api.model.Character
import br.senai.sp.jandira.rick_morty_api.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

//A gnt não implementa os métodos a gnt só fala quais métodos serão utilizados (criados)
interface CharacterService {

    @GET("character") //fala o que ele deve acrescentar na url base
    fun listAllCharacters(): Call<Result>//vai nos devolver uma call com a lista de personagens

    @GET("character/{id}") //o id vai ser substituido automaticamente, o retrofit sabe que precisa substituir
    fun getCharacterById(@Path("id") id: Int): Call<Character> //esse id precisa ser adicionado ao path para ele saber substituir la em cima

//    @POST("character")
//    fun insert(@Body character: Character): Call<Character>
}