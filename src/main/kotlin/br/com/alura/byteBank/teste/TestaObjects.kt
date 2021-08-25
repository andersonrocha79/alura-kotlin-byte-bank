package br.com.alura.byteBank.teste

import br.com.alura.byteBank.modelo.Autenticavel
import br.com.alura.byteBank.modelo.Cliente
import br.com.alura.byteBank.modelo.ContaCorrente
import br.com.alura.byteBank.modelo.ContaPoupanca

class TestaObjects
{

    fun testaObjects()
    {
        val alex = Cliente(nome = "alex", cpf = "111", senha = 1)

        ContaPoupanca(titular = alex, numero = 1000)
        ContaCorrente(titular = alex, numero = 1001)

        // objeto anonimo com utilização de interface
        val fran = object : Autenticavel {
            val nome: String = "Fran"
            val cpf: String = "111.111.111-11"
            val senha: Int = 1000
            override fun autentica(senha: Int) = this.senha == senha
        }

        println("nome do cliente: ${fran.nome}")
    }
}