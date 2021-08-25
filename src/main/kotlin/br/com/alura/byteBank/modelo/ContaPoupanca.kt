package br.com.alura.byteBank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int) :
    ContaComum(
        titular,
        numero)
{

    override fun saca(valor: Double)
    {

        val valorComTaxa = valor + 0.2

        if (this.saldo >= valorComTaxa)
        {
            this.saldo -= valorComTaxa
        }

    }

}