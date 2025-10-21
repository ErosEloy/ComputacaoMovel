fun temDescontoCinema(idade: Int, estudante: Boolean, diaSemana: String): Boolean{

    if (estudante || idade < 12) return true
    else if(diaSemana == "terça-feira" || diaSemana=="terça" || diaSemana == "quarta-feira" || diaSemana=="quarta") return true
    return false

}


fun main(){

    var estudante: Boolean
    print("Estudante? ")
    var respostaEstudante = readln()

    if (respostaEstudante.lowercase()=="sim") estudante = true
    else estudante = false

    print("\nIdade: ")
    var idade = readln().toInt()

    print("\nDia da semana: ")
    var diaSemana = readln()

    var temDesconto = temDescontoCinema(idade, estudante, diaSemana)

    if(temDesconto) println("Tem desconto!")
    else println("Não tem desconto!")


}