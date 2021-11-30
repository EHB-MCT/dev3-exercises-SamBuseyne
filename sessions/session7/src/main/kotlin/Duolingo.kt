public class Duolingo(var amountWords: Int, var language: String){
        val words = mutableListOf<Word>(
            Word(original = "Stutten", translated = "Boterhammen", language = "WestVlaams"),
            Word(original = "Forchette", translated = "Vork", language = "WestVlaams"),
            Word(original = "Boai", translated = "Trui", language = "WestVlaams"),
            Word(original = "Veste", translated = "Jas", language = "WestVlaams"),
            Word(original = "Rute", translated = "Raam", language = "WestVlaams"),
            Word(original = "Pattaten", translated = "Aardappelen", language = "WestVlaams"),
            Word(original = "Rute", translated = "Raam", language = "WestVlaams"),
        )

    fun play(words: Int, lang:String){
        val randomWords = words.shuffled().take(words).toMutableSet()
        println(randomWords.count())

        while(randomWords.isNotEmpty()){
            val selectedWord = randomWords.random()
            println("Zeg e ke ${selectedWord.original} int Nederlans")
            val userInput = readLine()
            if(userInput == selectedWord.translated){
                println(randomWords.count())
                println("Vree goed! Gemeugt verder doen door et volgende woord te vertalen")
                randomWords.remove(selectedWord)
            }else{
                println("Das nie juste eh! Upnieuw")
                println(randomWords.count())
            }
        }
    }
}