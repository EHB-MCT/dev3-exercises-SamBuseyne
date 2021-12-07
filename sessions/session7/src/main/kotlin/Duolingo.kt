class Duolingo {

    var roundSize: Int = 0
    var language: String = ""
    var level: String = ""


    constructor(roundSize: Int = 5, language: String = "en") {
        println("Hoevele woordn wildje per ronde?")
        this.roundSize = readLine()!!.toInt()

        println("Wukke taole kiesde? 'WestVlaams', 'English', 'Francais'")
        this.language = readLine()!!

        println("Hoe moeilijk wilde dat da spel ier is? 'Vo beginners', 'Vo die peisn daze et kunnen ', 'Vo dechte taalnerds' ")
        this.language = readLine()!!
    }

    val words = mutableListOf<Word>(
        WestvlaamseWoorden(original = "Stutten", translated = "Boterhammen"),
        WestvlaamseWoorden(original = "Forchette", translated = "Vork"),
        WestvlaamseWoorden(original = "Boai", translated = "Trui"),
        WestvlaamseWoorden(original = "Veste", translated = "Jas"),
        WestvlaamseWoorden(original = "Rute", translated = "Raam"),
        WestvlaamseWoorden(original = "Pattaten", translated = "Aardappelen"),
        WestvlaamseWoorden(original = "Ajoen", translated = "Ui"),
        WestvlaamseWoorden(original = "Hespe", translated = "Hesp"),
        WestvlaamseWoorden(original = "Rennekoker", translated = "Schommel"),
        WestvlaamseWoorden(original = "Ges", translated = "Gras"),
        EnglishWord(original = "Window", translated = "Raam"),
        EnglishWord(original = "Car", translated = "Auto"),
        EnglishWord(original = "Human", translated = "Mens"),
        FrenchWord(original = "Baguette", translated = "Stokbrood"),
        FrenchWord(original = "Vin", translated = "Wijn"),
        FrenchWord(original = "Pain", translated = "Brood"),
        FrenchWord(original = "Boursin", translated = "Boursin"),
    )

    fun play(){
        if(level == "Vo beginners"){
            var currentWords = words.filter { it.language == language }.toMutableSet()
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
            if(this.language == "Engels"){
                println("Proficiat nu zieje nen echten pro, ad gaot over ${this.language} kootn")
            }else if(this.language == "WestVlaams"){
                println("Excellent Sire, you speak now ${this.language}")
            }else{
                println("Très bien, to parler ${this.language}")
            }

        }else if(level == "Vo die peisn daze et kunnen"){

        }else if(level == "Vo dechte taalnerds"){

        }
    }
}