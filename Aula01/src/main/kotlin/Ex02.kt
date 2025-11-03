fun main(){

    // VARIAVEIS ALUNO 1
    var notaTeorica1: Double
    var notaPratica1: Double
    var media1: Double

    // VARIAVEIS ALUNO 2
    var notaTeorica2: Double
    var notaPratica2: Double
    var media2: Double

    // Código Aluno 1
    print("Escreva o valor da nota teórica do aluno 1: ")
    notaTeorica1 = readln().toDouble()

    print("Escreva o valor da nota prática do aluno 1: ")
    notaPratica1 = readln().toDouble()

    media1 = (notaTeorica1*0.3) + (notaPratica1*0.7)


    print("Aluno 1: ")
    if(media1 >= 10){println("Aprovado!\n")}
    else{println("Reprovado!\n")}

    // Código Aluno 2
    print("Escreva o valor da nota teórica do aluno 2: ")
    notaTeorica2 = readln().toDouble()

    print("Escreva o valor da nota prática do aluno 2: ")
    notaPratica2 = readln().toDouble()

    media2 = (notaTeorica2*0.3) + (notaPratica2*0.7)


    print("Aluno 2: ")
    if(media2 >= 10){println("Aprovado! \n")}
    else{println("Reprovado! \n")}

    // Cálculo da maior média
    if(media1 > media2){println("O aluno 1 obteve a maior média!")}
    else if(media1==media2){println("A média dos alunos foi igual!")}
    else{println("O aluno 2 obteve a maior média!")}

}