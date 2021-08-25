package br.com.alura.byteBank.modelo

class SistemaInterno
{

    fun entra(admin : Autenticavel, senha: Int)
    {

        if (admin.autentica(senha))
        {
            println("*** ByteBank ***");
            println("Bem vindo !!!");
            println("---------------------------------");
        }
        else
        {
            println("*** ByteBank ***");
            println("Falha na autenticação :-(");
            println("---------------------------------");
        }

    }

}