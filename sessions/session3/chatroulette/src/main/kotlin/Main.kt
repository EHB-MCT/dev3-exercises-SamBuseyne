fun main() {
    val persons = arrayOf(Comedian("Philip"), Teacher("Bert"), Student("John"), Chatbot())
    val chatMatch = persons.random()
    chatMatch.introduce()
    chatMatch.talk()
}