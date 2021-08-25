package br.com.alura.byteBank.teste

import br.com.alura.byteBank.modelo.*

class TestaContasDiferentes
{

    public fun testaContasDiferentes()
    {

        val alex     = Cliente(nome = "Alex", cpf = "111", senha = 1)
        val ted      = Cliente(nome = "Ted", cpf = "222", senha = 2)
        val fran     = Cliente(
            nome = "Fran",
            cpf = "333",
            senha = 3,
            endereco = Endereco(logradouro = "Rua Teste", numero = 90, complemento = "ap2", bairro = "centro", cidade = "Pedro Leopoldo", cep="33600000")
        )

        val contaCorrente = ContaCorrente(titular = alex, numero = 1000)
        val contaPoupanca = ContaPoupanca(titular = fran, numero = 1001)
        val contaSalario  = ContaSalario(titular = ted, numero = 1002)

        contaCorrente.deposita(1000.0)
        contaPoupanca.deposita(1000.0)
        println("saldo conta corrente: ${contaCorrente.saldo}")
        println("saldo conta poupanca: ${contaPoupanca.saldo}")

        contaCorrente.saca(100.0)
        contaPoupanca.saca(100.0)
        println("saldo conta corrente apos saque : ${contaCorrente.saldo}")
        println("saldo conta poupanca apos saque: ${contaPoupanca.saldo}")

        contaCorrente.transfere(100.0, contaPoupanca)
        contaPoupanca.transfere(350.0, contaCorrente)
        println("saldo conta corrente apos transferencia : ${contaCorrente.saldo}")
        println("saldo conta poupanca apos transferencia: ${contaPoupanca.saldo}")

        contaSalario.deposita(500.0)
        contaSalario.saca(400.0)
        println("saldo conta salario: ${contaSalario.saldo}")
    }

}