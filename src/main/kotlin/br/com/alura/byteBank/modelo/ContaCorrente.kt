package br.com.alura.byteBank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int) :
    ContaComum(
        titular,
        numero)
{

    override fun saca(valor: Double)
    {

        val valorComTaxa = valor + 0.1

        if (this.saldo >= valorComTaxa)
        {
            this.saldo -= valorComTaxa
        }

    }

}