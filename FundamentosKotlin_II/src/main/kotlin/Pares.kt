fun main(){

    var numerosIntroduzidos = mutableListOf<Int>()
    var pares = mutableListOf<Int>()
    var impares = mutableListOf<Int>()
    var maior: Int; var menor: Int

    while(true){
        print("Escreva um número (0-99): ")
        val n = readLine()!!.toInt()
        if (n == 0) break
        numerosIntroduzidos.add(n)
    }

    for(numero in numerosIntroduzidos){
        if(numero % 2 == 0) pares.add(numero)
        else impares.add(numero)
    }

    maior = pares[0]
    for(numero in pares){
        if(numero >= maior) maior=numero
    }

    menor = impares[0]
    for(numero in impares){
        if(numero <= menor) menor=numero
    }

    println("O menor dos pares: $maior")
    println("O menor dos impares: $menor")

}