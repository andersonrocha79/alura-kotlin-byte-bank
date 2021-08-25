package br.com.alura.byteBank.teste

import br.com.alura.byteBank.modelo.Cliente
import br.com.alura.byteBank.modelo.ContaCorrente

fun testaCopiasReferencias()
{

    val joao     = Cliente(nome = "Joao", cpf = "111", senha = 1)
    val anderson = Cliente(nome = "Anderson", cpf = "222", senha = 2)
    val fran     = Cliente(nome = "Fran", cpf = "333", senha = 3)
    val maria    = Cliente(nome = "Maria", cpf = "444", senha = 4)

    // br.com.alura.byteBank.modelo.Conta().titular = "alex"
    val contaAnderson = ContaCorrente(anderson, 1000)
    contaAnderson.deposita(200.0)
    println("br.com.alura.byteBank.modelo.Conta: ${contaAnderson.titular}")
    println("Numero: ${contaAnderson.numero}")
    println("Saldo: ${contaAnderson.saldo}")

    println("-----------------------------")

    val contaFran = ContaCorrente(fran, 2000)
    contaFran.deposita(500.0)
    println("br.com.alura.byteBank.modelo.Conta: ${contaFran.titular}")
    println("Numero: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")

    println("TRABALHANDO COM VALOR")
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    println("TRABALHANDO COM REFERENCIA")
    val contaJoao = ContaCorrente(joao, 0)
    var contaMaria = contaJoao
    contaMaria.titular = maria

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    // mostrando que variáveis apontam para a mesma referência
    println(contaJoao)
    println(contaMaria)

}
