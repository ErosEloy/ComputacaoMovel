fun validarCadastro(email: String, senha: String): Boolean{

    if(!email.endsWith("@my.istec.pt", true)) return false
    else if (email.startsWith("@my.istec.pt", true)) return false
    else if(senha.length < 8) return false
    else if(!senha.any { it.isUpperCase() } ) return false
    else if(!senha.any { it.isLowerCase() } ) return false
    else if(!senha.any { it.isDigit() } ) return false
    else if(senha.all { it.isLetterOrDigit() } ) return false

    return true

}

fun main(){

    print("Escreva o seu email: ")
    var email = readln()

    print("Escreva a sua senha: ")
    var senha = readln()

    var emailValido = validarCadastro(email, senha)

    if(emailValido) println("O email e a senha são válidos")
    else println("O email e a senha são inválidos")

}