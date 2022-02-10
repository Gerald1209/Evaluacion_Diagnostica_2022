/*Cree una clase que permita realizar un CRUD utilizando una lista para un registro de
Clientes, los datos que se solicitan son: id, nombres, apellidos, dirección, celular, email.*/
fun main(){
    var ag1 = Agenda("001", "Raul","Lopez","Esteli","72849512","rlopez@gmail.com")
    var ag2 = Agenda("002", "Paola","Ruiz","Managua","84427331","pruiz@gmail.com")
    var ag3 = Agenda("003", "Eduardo","Bravo","Rivas","48484484","ebravo@gmail.com")

    val agenda = arrayListOf<Agenda>(ag1,ag2,ag3)
    println("----------------------------------")
    println("Elementos del arreglo")
    println("----------------------------------")

    for(elemento in agenda)
        println("$elemento")

    agenda[2]= Agenda("003", "Eduardo","Bravo","Granada","48484484","ebravo@gmail.com")

    println("----------------------------------")
    println("Elementos del arreglo al modificar la ciudad del registro  ag3")
    println("----------------------------------")

    for(elemento in agenda)
    println("$elemento")

    agenda.removeAt(1)

    println("----------------------------------")
    println("Elementos del arreglo despues de eliminar el registro ag2")
    println("----------------------------------")

    for(elemento in agenda)
        println("$elemento")

    println("----------------------------------")

    
}

data class Agenda(
    var id: String,
    var nomb: String,
    var apell: String,
    var dir: String,
    var cel: String,
    var email:String
)