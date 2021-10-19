fun main(){

    val persons = arrayOf(Chatbot("siri"),Student("matthias"), Student("dries"), Teacher("joachim"), Teacher("mike"), Comedian("sam"))
    val randomPerson = persons.random()

    randomPerson.introduce()
    randomPerson.talk()

}
