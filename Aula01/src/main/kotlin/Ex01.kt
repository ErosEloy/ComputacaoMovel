fun main(){

    var notaTeorica: Double
    var notaPratica: Double
    var media: Double

    print("Escreva o valor da nota teórica: ")
    notaTeorica = readln().toDouble()

    print("Escreva o valor da nota prática: ")
    notaPratica = readln().toDouble()

    media = (notaTeorica*0.3) + (notaPratica*0.7)


    if(media >= 10){println("Aprovado!")}
    else{println("Reprovado!")}

}