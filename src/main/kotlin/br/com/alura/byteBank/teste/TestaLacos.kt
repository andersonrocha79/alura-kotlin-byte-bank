package br.com.alura.byteBank.teste

fun testaLacos()
{

    println("WHILE")
    var i = 0;
    while (i < 5)
    {

        val titular     = "Nome $i"
        var saldo       = i + 100.0;

        println("Titular: $titular")
        println("Saldo..: $saldo")
        println("-------------------------------------")

        i++

    }

    // for (i in 1..3)
    // for (i in 10 downTo 1 step 2)
    println("FOR")
    for (i in 10 downTo 1)
    {

        if (i == 2) { break }

        if (i == 5) { continue }

        val titular     = "Anderson Rocha $i"
        val numeroConta = 1000 + i;
        var saldo       = i + 10.0;

        saldo = 100.0
        saldo += 20
        saldo -= 1000

        println("Titular........: $titular")
        println("Número da br.com.alura.byteBank.modelo.Conta: $numeroConta")
        println("Saldo..........: $saldo")
        println("-------------------------------------")

    }
    
}