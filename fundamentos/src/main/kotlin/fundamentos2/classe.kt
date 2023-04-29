package fundamentos2

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono){

}

data class Dono(var nome: String, var idade: Int){

}

fun main(){
    var carro = Carro("Branco", 2021, Dono("Julio", 40))

    println(carro.cor)
    carro.cor = "preto"

    println(carro.cor)


    println(carro.dono.nome)
    carro.dono.nome = "Julio"

    println(carro.dono)
}