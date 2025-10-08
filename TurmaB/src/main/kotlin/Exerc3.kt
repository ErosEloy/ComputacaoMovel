fun main(){

    /*
    Declarar vars

    var nome  = "" //Sem tipo definido
    var nome2: String // cCom tipo definido
   ----------------------------------------

   escrever na tela
   print(nome)

   -----------------------------------------
   ler valores de input

   nome = readLine()!!
    * */

    var testeTeorico: Double;
    var testePratico:Double;
    var notaFinal: Double;

    print("Insira a nota do teste teórico - ");
    testeTeorico = readLine()!!.toDouble();
    print("Insira a nota do teste prático - ")
    testePratico = readLine()!!.toDouble();
    notaFinal = testeTeorico * 0.3 + testePratico * 0.7;
    if(notaFinal > 10){
        print("Aprovado");
    }else{
        print("Reprovado");
    }

    // Verifica se a nota final é par, ímpar, ou nenhum dos dois
    if (notaFinal % 2 == 0.0) println("$notaFinal - Par")
    else if (notaFinal % 2 == 1.0) println("$notaFinal - Ímpar")
    else println("$notaFinal - Não é par nem ímpar")
}

