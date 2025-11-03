import java.io.File
import java.io.FileNotFoundException

fun main(){

    var soma: Int = 0

    try {
        /*Caminho completo de um ficheiro na vossa máquina*/
        val caminho = "C:\\Users\\eros.eloy\\Desktop\\teste.txt"
        val conteudoDoFicheiro = File(caminho).readLines()

        for(linha in conteudoDoFicheiro){
            try {
                soma += linha.toInt()
            } catch (e: NumberFormatException) {
                println("$linha não é um inteiro")
            }
        }

        println("A soma é $soma")

    }catch(e: FileNotFoundException){
        println("Ficheiro não encontrado!")
    }

}