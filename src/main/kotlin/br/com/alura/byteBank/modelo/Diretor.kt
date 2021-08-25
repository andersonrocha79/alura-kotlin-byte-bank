package br.com.alura.byteBank.modelo

class Diretor(nome: String,
              cpf: String,
              salario: Double,
              senha : Int,
              val plr : Double) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha)
{

    override fun getBonificacao(): Double
    {
        // chama o método da classe mãe
        return salario + plr
    }

}