class Student (override val name: String) : Person(name), ChatPartner {
    override fun talk() {
        gossip()
    }

    fun gossip() {
        println("Smart of you to look here - but I'm not spilling the tea here :-)")
    }
}