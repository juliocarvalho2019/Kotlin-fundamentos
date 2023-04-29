package fundamentos3

fun main(){
    println(retornaName())

    dizOi(retornaName(), 24)
    dizOi(idade = 24, nome ="Gustavo")
    dizOi("Daniel")
}

fun retornaName(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int = 20){
    println("Oi ${nome}, parábens pelo seus ${idade} anos")
}