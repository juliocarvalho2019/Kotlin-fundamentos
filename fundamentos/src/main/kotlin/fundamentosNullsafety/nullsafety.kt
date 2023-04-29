package fundamentosWhen

fun main() {
    var nome : String? = "Gustavo"

    //Elvys operator
    var tamanho: Int = nome?.length ?: 0


    if(nome != null){
        println(nome.length)
    }


    val toShort : Short = nome !!.length.toShort()

}

