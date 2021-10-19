fun main(){
    val matthias = Student("matthias")
    val dries = Student("dries")
    val joachim = Teacher("joachim")
    val mike = Teacher ("mike")
    val sam = Comedian("sam")
    val siri = Chatbot("siri")

    val persons = arrayOf(siri,matthias, dries, joachim, mike, sam)
    val randomPerson = persons.random()

    randomPerson.introduce()
    when(randomPerson) {
        is Student -> randomPerson.gossip()
        is Teacher -> randomPerson.funfact()
        is Comedian -> randomPerson.joke()
        is Chatbot -> randomPerson.chat()
    }

}
