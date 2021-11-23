open class Person (open val name: String) {
    fun introduce() {
        println("Hi! I'm $name")
    }

    open fun talk() {
        println("How are you doing?")
    }
}