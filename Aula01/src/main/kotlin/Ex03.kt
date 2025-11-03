fun main(){

    var notaTeorica: Double
    var notaPratica: Double
    var media: Double

    print("Escreva o valor da nota teórica: ")
    notaTeorica = readln().toDouble()

    print("Escreva o valor da nota prática: ")
    notaPratica = readln().toDouble()

    media = (notaTeorica*0.3) + (notaPratica*0.7)


    if(media >= 10){println("\nAprovado!\n")}
    else{println("\nReprovado!\n")}

    if (media%2==0.0){println("A média é par")}
    else{println("A média é impar!\n")}

}