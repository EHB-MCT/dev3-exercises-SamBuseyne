class Teacher (override val name: String) : Person(name), ChatPartner {
    override fun talk() {
        funFact()
    }

    fun funFact() {
        println("Did you know the name Kotlin is based on an island near the coast of St. Petersburg?")
    }
}