package br.com.alura.byteBank.teste

import br.com.alura.byteBank.modelo.*

public fun testaFuncionarios()
{

    val alex = Analista("Alex", "12345678900", 1000.0)

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")

    println("bonificação ${alex.getBonificacao()}")

    val gerente = Gerente("br.com.alura.byteBank.modelo.Gerente", "1111111111111", 1000.0, 123)

    println("nome ${gerente.nome}")
    println("cpf ${gerente.cpf}")
    println("salario ${gerente.salario}")

    println("bonificação ${gerente.getBonificacao()}")

    if (gerente.autentica(123)) {
        println("*** usuário autenticado com sucesso.")
    } else {
        println("*** falha na autenticacao.")
    }

    val diretor = Diretor("br.com.alura.byteBank.modelo.Diretor", "22222222222", 1000.0, 4000, 200.0)

    val analista1 = Analista("br.com.alura.byteBank.modelo.Analista", "3333", 100.0)

    val analista2 = Analista(
        nome = "Anderson",
        cpf = "11122233399",
        salario = 500.0
    )

    val analista3: Funcionario = Analista(
        nome = "Hiriane",
        cpf = "11122233388",
        salario = 700.0
    )

    val analista4: Funcionario = Diretor(
        nome = "Hiriane",
        cpf = "11122233388",
        salario = 700.0,
        senha = 123,
        plr = 900.0
    )

    println("nome ${diretor.nome}")
    println("cpf ${diretor.cpf}")
    println("salario ${diretor.salario}")

    println("bonificação ${diretor.getBonificacao()}")
    println("plr ${diretor.plr}")

    if (diretor.autentica(4000)) {
        println("*** usuário autenticado com sucesso.")
    } else {
        println("*** falha na autenticacao.")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex);
    calculadora.registra(diretor);
    calculadora.registra(gerente);
    calculadora.registra(analista1);
    calculadora.registra(analista2);
    calculadora.registra(analista3);
    calculadora.registra(analista4);

    println("total de bonificação: ${calculadora.total}")
}