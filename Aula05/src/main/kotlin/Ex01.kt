import java.io.File
import java.io.FileNotFoundException

fun main(){

    try {
        /*Caminho completo de um ficheiro na vossa máquina*/
        val caminho = "C:\\Users\\eros.eloy\\Desktop\\testee.txt"
        val conteudoDoFicheiro = File(caminho).readLines()

        for(linha in conteudoDoFicheiro){
            println(linha)
        }
    }catch (e: FileNotFoundException){
        println("Ficheiro não encontrado!")
    }

}