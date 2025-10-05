fun main(){

    val pesoTesteTeorico: Double = 0.3
    val pesoTestePratico: Double = 0.7
    var notaTesteTeorico: Double
    var notaTestePratico: Double
    var media: Double

    print("Insira a noma do teste teórico: ")
    notaTesteTeorico = readLine()!!.toDouble()

    print("Insira a noma do teste prático: ")
    notaTestePratico = readLine()!!.toDouble()

    media = notaTesteTeorico*pesoTesteTeorico + notaTestePratico*pesoTestePratico


    print("A sua média é: $media")

}