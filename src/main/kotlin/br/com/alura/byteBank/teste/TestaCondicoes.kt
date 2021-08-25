package br.com.alura.byteBank.teste

fun testaCondicoes(saldo : Double)
{

    println("IF")
    if (saldo > 0.0)
    {
        println("br.com.alura.byteBank.modelo.Conta é Positiva")
    }
    else if (saldo == 0.0)
    {
        println("br.com.alura.byteBank.modelo.Conta é Neutra")
    }
    else
    {
        println("br.com.alura.byteBank.modelo.Conta é Negativa")
    }

    println("WHEN")
    when
    {
        saldo  > 0.0    -> println("br.com.alura.byteBank.modelo.Conta é Positiva")
        saldo == 0.0    -> println("br.com.alura.byteBank.modelo.Conta é Neutra")
        else            -> println("br.com.alura.byteBank.modelo.Conta é Negativa")
    }

}
