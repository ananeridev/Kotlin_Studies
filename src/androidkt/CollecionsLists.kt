package androidkt

fun main(args: Array<String>) {
    var arrayList = arrayListOf("Rachel", "Ross", "Joey", "Chandler", "Monica", "Phoebe")
    // posso adicionar um elemnro novo
    arrayList.add("Richard")
    println(arrayList)

    // posso remover um elemento
    arrayList.remove("Richard")
    println(arrayList)

    // verificar o tamanho d raayList
    println(arrayList.size)
    println(arrayList)

    // verificar se a lista esta vazia
    println(arrayList.isEmpty())
    println(arrayList)

    // verificar se contem algum elemento
    println(arrayList.contains("Rachel"))

    // navegar pela lista
   for (nome in arrayList) {
       println(nome)
   }
}