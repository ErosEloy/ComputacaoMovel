fun temDireitoAportesGratis(valorCompra: Double, clientePremium: Boolean): Boolean{

    if (clientePremium){return true}
    else if (valorCompra >= 30.0){return true}
    else{return false}

}

fun main(){

    var premium: Boolean

    print("Qual o valor total da compra: ")
    var valor = readln().toDouble()

    print("É um cliente premium: ")
    var respostaPremium = readln()

    if(respostaPremium.lowercase() == "sim"){premium=true}
    else{premium=false}

    var temDireito=temDireitoAportesGratis(valor, premium)

    if(temDireito){
        println("O cliente tem direito a portes!")
    }else{println("O cliente não tem direito a portes!")}

}