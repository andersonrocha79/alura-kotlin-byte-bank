package br.com.alura.byteBank.teste

import br.com.alura.byteBank.modelo.*

class TestaAutenticacao
{

    fun testa()
    {

        val gerente = Gerente(nome = "Alex", cpf = "12345678900", salario = 1000.0, senha = 123);

        val diretor = Diretor(nome = "Fran", cpf = "22222222288", salario = 1000.0, senha = 123, plr = 300.0);

        val cliente1 = Cliente(nome = "cliente", cpf = "22222222288", senha = 1234);

        val sistema = SistemaInterno()

        sistema.entra(gerente,123)
        sistema.entra(diretor,123)
        sistema.entra(cliente1,123)

        val pessoaAutenticavel : Autenticavel = Gerente("aaa", "1234567890", 50.0, 123)

    }

}