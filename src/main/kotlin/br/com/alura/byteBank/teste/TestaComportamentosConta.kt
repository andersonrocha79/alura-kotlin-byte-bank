package br.com.alura.byteBank.teste

import br.com.alura.byteBank.modelo.Cliente
import br.com.alura.byteBank.modelo.ContaCorrente
import br.com.alura.byteBank.modelo.ContaPoupanca

fun testaComportamentosConta()
{

    // var saldo = 1500.0

    // br.com.alura.byteBank.teste.testaCondicoes(saldo)

    // br.com.alura.byteBank.teste.testaLacos()

    // br.com.alura.byteBank.teste.testaCopiasReferencias()

    val alex     = Cliente(nome = "Alex", cpf = "111", senha = 1)
    val anderson = Cliente(nome = "Anderson", cpf = "222", senha = 2)
    val fran     = Cliente(nome = "Fran", cpf = "333", senha = 3)

    // br.com.alura.byteBank.modelo.Conta().titular = "alex"
    val contaAnderson = ContaCorrente(anderson, 1000)
    contaAnderson.deposita(200.0)
    println("br.com.alura.byteBank.modelo.Conta: ${contaAnderson.titular}")
    println("Numero: ${contaAnderson.numero}")
    println("Saldo: ${contaAnderson.saldo}")

    println("-----------------------------")

    // os parâmetros do construtor podem ser passados em fora de ordem, caso seja necessário
    val contaFran = ContaPoupanca(numero = 1500, titular = fran)
    contaFran.deposita(500.0)
    println("br.com.alura.byteBank.modelo.Conta: ${contaFran.titular}")
    println("Numero: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")

    println("depositando na conta do Anderson")
    contaAnderson.deposita(50.0)
    println("Saldo: ${contaAnderson.saldo}")
    contaAnderson.saca(600.0);
    println("Saldo: ${contaAnderson.saldo}")

    println("depositando na conta da Fran")
    contaFran.deposita(950.0)
    println("Saldo: ${contaFran.saldo}")
    contaFran.saca(100.0);
    println("Saldo: ${contaFran.saldo}")

    println("transferencia entre contas")
    if (!contaFran.transfere(100.0, contaAnderson)) {
        println("operação não realizada")
    } else {
        println("transferência realizada")
        println("Saldo origem - Fran: ${contaFran.saldo}")
        println("Saldo destino - Anderson: ${contaAnderson.saldo}")
    }

}
