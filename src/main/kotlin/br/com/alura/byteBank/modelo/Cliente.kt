package br.com.alura.byteBank.modelo

class Cliente(
    var nome : String,
    val cpf: String,
    var endereco : Endereco = Endereco(), // já inicializa o endereço com os valores default
    private val senha : Int) : Autenticavel
{

    override fun autentica(senha : Int):Boolean
    {
        println("---- > autenticacao br.com.alura.byteBank.modelo.Cliente")
        return (this.senha == senha)
    }

}