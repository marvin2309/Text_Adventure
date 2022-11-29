import kotlin.random.Random

public class Raabe {
    private var currentNumber = -1
    private val listAufgaben = ArrayList<String>()
    private val listLoesung = ArrayList<String>()

    constructor() {
        this.currentNumber = setRandomNumber()
        this.listAufgaben.add("p + o = 5 \np + x = 6 \nx + o = ?")
        this.listLoesung.add("3")
    }

    fun printRaetsel() {
        println("'Gru gru' *macht es als der Rätsel Raabe dir zu Hilfe kommt*")
        println(listAufgaben[currentNumber])
    }

    fun checkLoesung(Loesung: String): Boolean {
        if (Loesung.equals(listLoesung[currentNumber])) return true
        return false
    }
    private fun setRandomNumber(): Int {
        return 0
        //(0 until this.listAufgaben.size).shuffled().last()

    }
}