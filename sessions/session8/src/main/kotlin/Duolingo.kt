class Duolingo (val language: String){
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
    init{
        println("Hoe moeilijk wilde dat da spel ier is? 'Vo beginners', of 'Vo dechte taalnerds' ")
        var diff = readLine()!!.toString();
        var size = 0;
        if(diff =="Vo beginners"){
            size = 5;
        }else if (diff == "Vo dechte taalnerds"){
            size = 10;
        }else{
            throw Exception("Kuje alsjeblieft een twuk verstaanbaars intikken?")
            main();
        }
        var randomWords = words.shuffled().filter{it.language == language}.take(size).toMutableList();
        play(randomWords)
    }

    fun play(randomWords:MutableList<Word>){
        while(randomWords.isNotEmpty()){
            val selectedWord = randomWords.random()
            //Question for user
            println("Vertaalde ke " + selectedWord.original + " int Vlams")
            val userInput = readLine()
            //User got answer correct
            if(userInput == selectedWord.translated){
                //lowers diff
                selectedWord.diff = selectedWord.diff - 1
                //removes word
                randomWords.remove(selectedWord);
                println("Vree goed! Gemeugt verder doen door et volgende woord te vertalen. Tga wa makkelijker zijn want tis nu te doen up niveau ${selectedWord.diff}")
            }
            //user got answer wrong
            else{
                //ups diff
                selectedWord.diff = selectedWord.diff + 2
                println("Das nie juste eh! Upnieuw, trouwens et juist antwoord was: ${selectedWord.translated}. Tga wa moeilijker zijn want tis nu te doen up niveau ${selectedWord.diff}")
            }
            when{
                randomWords.count()==0 -> println("Goe bezig maot!")
                randomWords.count()>0 -> println("Tzin der nog" + " " + randomWords.count() + " " + "te gaan")
            }
        }
    }
}