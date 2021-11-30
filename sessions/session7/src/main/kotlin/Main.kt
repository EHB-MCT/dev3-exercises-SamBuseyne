fun main(){
    duolingoApp()
}
fun duolingoApp(){
    val app = Duolingo(5,"WestVlaams")
    println("Initializing game...")
    println("...")
    println("How many words do you want?")
    val amountWords = readLine()
    println("Language of the game?")
    val language = readLine()
    app.play(amountWords: Int, language: String)
}