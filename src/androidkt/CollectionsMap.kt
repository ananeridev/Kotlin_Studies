package androidkt

fun main(args: Array<String>) {
    var map = hashMapOf("Chave1" to 1, "Chave2" to 2, "Chave3" to 3)

    // adicionar uma chave
    map.put("Chave4", 4)

    for (chave in map.keys) {
        // buscando um valor
        println("$chave:${map.get(chave)}")
    }

}