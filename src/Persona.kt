class Persona(val peso: Double, var altura: Double) {
    var nombre: String = "PersonaX"

    fun calcularImc() : Double = peso/(altura * altura)

    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        return "$nombre, con peso $peso y altura $altura, tiene un IMC de ${calcularImc()}"
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Persona) return false
        return this.nombre == other.nombre && this.peso == other.peso && this.altura == other.altura
    }
}