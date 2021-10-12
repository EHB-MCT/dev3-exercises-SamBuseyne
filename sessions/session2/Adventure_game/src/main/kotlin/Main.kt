fun main(){
    challengeOne()
}

fun challengeOne(){
    println("Winter is coming")
    println("What house do you serve?")
    val correctAnswers = setOf<String>("Lannister","Targaryen", "Stark")
    val userAnswer = readLine()
    if(correctAnswers.contains(userAnswer)){
        challengeTwo()
    }else{
        gameOver()
    }
}

fun challengeTwo(){
    val userInput = readLine().toString()
    val randomNumber = (1..6).random()
    //TODO: check strings
    if(randomNumber >= 4){
        println("You have won the game")
    }else{
        gameOver()
    }
}


fun gameOver(){
    println("Wrong, winter is coming!!!")
    println("You are now a member of the Army of the dead")
}
