package br.com.alura.byteBank.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int) :
    Conta(
        titular,
        numero)
{

    override fun saca(valor: Double)
    {

        val valorComTaxa = valor + 0 // conta salário saca sem taxas

        if (this.saldo >= valorComTaxa)
        {
            this.saldo -= valorComTaxa
        }

    }

}