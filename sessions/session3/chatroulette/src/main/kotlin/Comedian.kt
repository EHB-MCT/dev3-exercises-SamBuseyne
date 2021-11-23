class Comedian (override val name: String) : Person(name), ChatPartner {
    override fun talk() {
        tellJoke()
    }

    fun tellJoke() {
        println("People in Dubai don't like 'The Flintstones', but people in Abu Dhabi Dooo")
    }
}