class Chatbot(val name:String): ChatPartner {
    override fun introduce(){
        println("Hi, my name is $name")
    }
    override fun talk(){
        println("Rebooting system")
        println("Starting chatroulette...")
        println("3")
        println("2")
        println("1")
        println("Hello, my name is $name")
    }
}

