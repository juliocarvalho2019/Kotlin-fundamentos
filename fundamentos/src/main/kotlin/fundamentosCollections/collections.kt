package fundamentosCollections

fun main() {

    var lista = mutableListOf(1, 2, 3, 4)
    println(lista)

    var setNumeros = mutableSetOf(0, 1, 2, 3, 4, 5)
    println(setNumeros)

    var mapNomeIdade = mapOf("Gustavo" to 24, "Daniel" to 20)
    println(mapNomeIdade)
    

    lista.add(8)

    lista.removeAt(0)
    lista.remove(3)

    println(lista)



    for (numero in lista){
        println(numero)
    }

    println(lista[0])

    println(lista.get(0))

    println(lista.size)

    println(lista.indexOf(6))
}

