package br.com.alura.byteBank.modelo

interface Autenticavel
{

    fun autentica(senha : Int) : Boolean

    // val senha : Int // quem implementar precisa ter este campo

    /*
    esta implementação não é segura, visto que a variável senha ficará pública e acessível em todas as classes qaue implementam esta interface
    fun autentica(senha : Int) : Boolean
    {
        println("---- > autenticacao br.com.alura.byteBank.modelo.Autenticavel")
        return (this.senha == senha)
    }
     */

}