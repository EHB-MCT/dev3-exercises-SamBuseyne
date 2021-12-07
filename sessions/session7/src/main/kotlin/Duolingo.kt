class Duolingo {

    var roundSize: Int = 0
    var language: String = ""

    constructor(roundSize: Int = 5, language: String = "en") {
        println("Hoevele woordn wildje per ronde?")
        this.roundSize = readLine()!!.toInt()

        println("Wukke taole kiesde? 'WestVlaams' of 'WestVlaams'")
        this.language = readLine()!!
    }

    val words = mutableListOf<Word>(
        Word(original = "Stutten", translated = "Boterhammen", language = "WestVlaams"),
        Word(original = "Forchette", translated = "Vork", language = "WestVlaams"),
        Word(original = "Boai", translated = "Trui", language = "WestVlaams"),
        Word(original = "Veste", translated = "Jas", language = "WestVlaams"),
        Word(original = "Rute", translated = "Raam", language = "WestVlaams"),
        Word(original = "Pattaten", translated = "Aardappelen", language = "WestVlaams"),
        Word(original = "Rute", translated = "Raam", language = "WestVlaams"),
    )

    fun play(){
        var currentWords = words.filter { it.language == this.language }.toMutableSet()
        currentWords = currentWords.shuffled().take(this.roundSize).toMutableSet()

        while (currentWords.isNotEmpty()){
            val selectedWord = currentWords.random()
            println(currentWords.count())
            println("Wuk is de vertaling van: ${selectedWord.original}")
            val userAnswer = readLine()

            if (userAnswer != selectedWord.translated) {
                println("Das nie juste eh! Upnieuw")
                currentWords.shuffled()
            } else {
                currentWords.remove(selectedWord)
                println("Vree goed! Gemeugt verder doen door et volgende woord te vertalen")
            }

        }
        println("Proficiat nu zieje nen echten pro, ad gaot over West-Vlaoms kootn")

    }
}