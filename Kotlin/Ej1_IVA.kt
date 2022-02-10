/*Leer el precio de un producto y aplicar el IVA (15% del precio del producto)*/
fun main() {
    var precio:Double =20.0
    var iva:Double = aplicarIva(precio)
    println("El producto $precio tiene un IVA de $iva")
}

fun  aplicarIva(pre:Double):Double{
    return pre * 1.15
}