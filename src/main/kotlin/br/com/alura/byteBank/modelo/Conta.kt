package br.com.alura.byteBank.modelo

// as variáveis definidas na declaração da classe serão
// registradas como variáveis da classe
abstract class Conta(
    var titular: Cliente,
    val numero: Int)
{

    // objeto singleton que mantém o valor na 'classe' e não na instância
    // companion Object indica que este objeto irá compartilhar seus membros na classe em que foi declarado
    companion object Contador
    {
        var total = 0
        private set
    }

    // var titular = titular       // variável já definidas pelo construtor
    // var numero  = numero        // variável já definidas pelo construtor

    var saldo = 0.0
        protected set       // define que o 'set' é protegido, acessível apenas nas classes filhas. O 'get' é público

    // var total = 0



    init
    {
        // o que será executado durante a construção
        println("----> criando nova conta")
        Contador.total++
        // total++
    }

    /*
    construtor secundário, caso seja necessário
    constructor(titular: String, numero: Int)
    {
        this.titular = titular
        this.numero = numero
    }
     */

    fun deposita(valor : Double)
    {
        saldo += valor
    }

    abstract fun saca(valor : Double)


    /*
    fun saldo : Double
    {
        return saldo
    }
    */

}