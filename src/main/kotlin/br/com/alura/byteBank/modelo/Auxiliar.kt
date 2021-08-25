package br.com.alura.byteBank.modelo

class Auxiliar(nome: String,
               cpf: String,
               salario: Double) : Funcionario(nome = nome, cpf = cpf, salario = salario)
{

    override fun getBonificacao(): Double
    {
        return salario * 0.5
    }

}