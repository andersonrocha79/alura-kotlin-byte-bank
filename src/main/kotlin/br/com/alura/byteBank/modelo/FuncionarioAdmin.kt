package br.com.alura.byteBank.modelo

// open indica que esta classe pode ser herdada em outras subclasses
// abstract indica que a classe não pode ser 'instanciada', apenas herdada (não precisa colocar open nestes casos)
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int) : Funcionario(nome = nome, cpf = cpf, salario = salario),
    Autenticavel // funcionario admin é um funcionario
{

    // open indica que este método pode ser sobrescrito nas classes filhas

    // função convertida para 'property'
    // indica que este membro não pode ter implementação nesta classe, apenas nas classes filhas
    // abstract fun getBonificacao(): Double -> método será implementado no filho

    override fun autentica(senha : Int):Boolean
    {
        println("---- > autenticacao br.com.alura.byteBank.modelo.FuncionarioAdmin")
        return (this.senha == senha)
    }

    // outra sintaxe
    // open val bonificacao: Double get() = salario * 0.1

    /*
    função
    open fun bonificacao(): Double
    {
        return salario * 0.1
    }
     */

    /*
        /*
        when (tipo)
        {
            0 ->
            {
                return salario * 0.1
            }
            1 ->
            {
                return salario * 0.2
            }
            2 ->
            {
                return salario * 0.3
            }
            else ->
            {
                return salario
            }
        }
        */

     */

}