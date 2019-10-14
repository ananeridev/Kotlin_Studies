package androidkt

// as constantes nao mudam no enum
enum class Direcao {
    NORTE, SUL, LESTE, OESTE
}

class Bussola {
    var direcao: Direcao = Direcao.LESTE
}

// facilita o trabalho com Strings
fun main(args: Array<String>) {
    val bussola = Bussola()

    println(bussola.direcao)

    // isso permite trabalhar com constantes sem problema nenhumm
    bussola.direcao = Direcao.NORTE
    println(bussola.direcao)
}