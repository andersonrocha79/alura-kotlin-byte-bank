package br.com.alura.byteBank.modelo

abstract class ContaComum(
    titular: Cliente,
    numero: Int) :
    Conta(
        titular = titular,
        numero = numero)
{

    fun transfere(valor : Double, destino: Conta) : Boolean
    {

        if (saldo >= valor)
        {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        else
        {
            println("*** saldo indisponível")
            return false
        }

    }

}