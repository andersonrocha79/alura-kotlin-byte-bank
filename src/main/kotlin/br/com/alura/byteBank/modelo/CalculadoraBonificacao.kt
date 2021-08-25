package br.com.alura.byteBank.modelo

class CalculadoraBonificacao
{

    var total : Double = 0.00
    private set // set será privado e get público

    fun registra(funcionario: Funcionario)
    {
        this.total += funcionario.getBonificacao()
    }

    /*
    fun registra(funcionario: br.com.alura.byteBank.modelo.Gerente)
    {
        this.total += funcionario.getBonificacao()
    }

    fun registra(funcionario: br.com.alura.byteBank.modelo.Diretor)
    {
        this.total += funcionario.getBonificacao()
    }
     */

}