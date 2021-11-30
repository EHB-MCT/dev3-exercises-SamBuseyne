public class Duolingo{
        val words = mutableListOf<Word>(
            Word(original = "Stutten", translated = "Boterhammen", language = "WestVlaams"),
            Word(original = "Forchette", translated = "Vork", language = "WestVlaams"),
            Word(original = "Boai", translated = "Trui", language = "WestVlaams"),
            Word(original = "Veste", translated = "Trui", language = "WestVlaams"),
            Word(original = "Rute", translated = "Raam", language = "WestVlaams")
        )

    fun play(){
        words.random()
        val currentWords = words
        val userInput = readLine()
        println(currentWords)
        words.shuffle()
        println(currentWords)
    }
}