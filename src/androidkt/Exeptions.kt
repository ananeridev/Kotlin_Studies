package androidkt

import java.lang.Exception

fun main(args: Array<String>) {

    print("Digite um numero: ")

    // O cod abaixo vai gerar um java.lang.ArithmeticException se for haver divisao por 0

//    //Assumindo o risco de aceitar um valor nulo com "!!"
//    //"toInt" para converter para inteiro qualquer numero q o usuario digitar
//    val numero: Int = readLine()!!.toInt()
//    val divisao: Int = 100 / numero
//    println("A divisão é: $divisao")
//

    try {
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100 / numero
        println("A divisão é: $divisao")
    }catch (e: Exception){
        println("Erro: ${e.message}")
    }finally {
        println("Programa finalizado =)")
    }
}