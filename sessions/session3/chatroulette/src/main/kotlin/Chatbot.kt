class Chatbot(override val name:String): Person(name) {
    fun chat(){
        println("Rebooting system")
        println("Starting chatroulette...")
        println("3")
        println("2")
        println("1")
        println("Hello, my name is $name")
    }
}