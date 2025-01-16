class Persona(val peso: Double, val altura: Double) {
    var nombre: String = ""

    private var imc: Double = peso/(altura * altura)

    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        return "$nombre, con peso $peso y altura $altura, tiene un IMC de $imc"
    }


}