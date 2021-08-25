import br.com.alura.byteBank.modelo.*
import br.com.alura.byteBank.teste.TestaAutenticacao
import br.com.alura.byteBank.teste.TestaContasDiferentes
import br.com.alura.byteBank.teste.TestaObjects

import java.lang.String as StringJava

/*

    https://kotlinlang.org/docs/basic-syntax.html

    https://kotlinlang.org/docs/idioms.html#read-only-list

 */

// variável global (teste)
// var totalContasGlobal = 0
//    private set

fun main()
{

    val palavra     : kotlin.String;
    val palavraJava : StringJava;

    TestaObjects().testaObjects()

    TestaAutenticacao().testa()

    TestaContasDiferentes().testaContasDiferentes()

    imprime(1)
    imprime(1.5)
    imprime(Endereco("Teste", 50))

    var objeto : Any = Any()
    imprime(objeto)

    registra(Gerente("ars", "", 50.0,123456))
    registra(50)

    // println("Total de Contas: ${totalContasGlobal}")

    // br.com.alura.byteBank.teste.testaComportamentosConta()

    // br.com.alura.byteBank.teste.testaFuncionarios()

    // equals
    val endereco1 = Endereco("Rua 1", 123, "novo campinho", "bh", "MG", "3499898", "apart 02")
    val endereco2 = Endereco("Rua 2", 123, "centro", "bh", "MG", "33445556", "apart 02")
    println(endereco1.equals(endereco2))

    // hashcode
    println(endereco1.hashCode())
    println(endereco2.hashCode())

    // toString
    println(endereco1.toString())
    println(endereco2.toString())

    println("Total de Contas: ${Conta.Contador.total}")

}

fun imprime(valor: Any)
{
    println(valor)
}

fun registra(funcionario : Any)
{
    if (funcionario is Funcionario)
    {
        funcionario.getBonificacao()
    }
}






