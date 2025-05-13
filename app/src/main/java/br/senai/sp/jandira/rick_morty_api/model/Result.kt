package br.senai.sp.jandira.rick_morty_api.model
//Essa classe vai conter a lista de personagens
data class Result(
    var results: List<Character>? = null //importa a lista de persoangens do nosso outro arquivo e inicialmente é uma lista vazia
)
