package br.com.alura.byteBank.modelo

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              senha : Int) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha)
{

    override fun getBonificacao(): Double
    {
        return salario
    }

}