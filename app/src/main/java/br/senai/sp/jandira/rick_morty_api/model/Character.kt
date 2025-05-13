package br.senai.sp.jandira.rick_morty_api.model
//esse cria personagem por personagem e o outro cria uma lista desses personagens
data class Character(
    //quando formos criar um personagem, é necessário fornecer os seguintes atributos
    //o nome do atributo no kotlin tem que ser o mesmo que no json
    var id: Int = 0, //no kotlin é necessario iniciar a variavel no 0 ou vazio
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var image: String = ""


)
