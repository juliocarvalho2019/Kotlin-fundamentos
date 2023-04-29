package fundamentosIfElse
fun main() {
    parOuImpar(2)
    parOuImpar(3)

    resultadoDaNota(5)
    resultadoDaNota(6)
    resultadoDaNota(3)


}

fun parOuImpar(numero: Int){
    if(numero % 2 == 0){
        println("Par")
    }else{
        println("Impar")
    }
}

fun resultadoDaNota(nota:Int){
    if(nota >= 6){
        println("Passou")
    }else if(nota >= 4){
        println("Recuperação")
    }else{
        println("Reprovou")
    }
}
