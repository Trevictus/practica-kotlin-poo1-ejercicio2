fun main() {
    val persona1 = Persona(68.7, 1.67)
    val persona2 = Persona( "Benjamín",72.0, 1.72,)
    val persona3 = Persona("Amancio", 120.0, 1.99)

    println(persona1)
    while (true) {
        println("Introduce el nombre de la persona 1: ")
        val nombre = readln().isNotBlank()

        print("Vuelve a intentarlo.")
        persona1.nombre = nombre.toString()
        break
    }
    println(persona2)
    println(persona3)
}