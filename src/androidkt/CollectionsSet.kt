package androidkt

fun main(args: Array<String>) {
    // hash é mais rapido que arraylist
    var set = hashSetOf(1, 2, 3, 4, 5, 6, 7, 100, 100)

    // adiciona elemento
    set.add(1029)

    // remove elemento
    set.remove(1)

    // hash nao guarda a ordem e numeros duplicados
    for (item in set) {
        println(item)
    }
}