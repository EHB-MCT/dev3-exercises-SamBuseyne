fun main(){
    challengeOne()
}

fun challengeOne(){
    println("Winter is coming")
    println("What house do you serve?")
    val correctAnswers = setOf<String>("Lannister","Targaryen", "Stark")
    val userAnswer = readLine()
    if(correctAnswers.contains(userAnswer)){
        succes()
    }else{
        gameOver()
    }
}

fun succes(){
    println("You are lucky!!")
}

fun gameOver(){
    println("Wrong side, winter is coming!!!")
    println("You are now a member of the Army of the dead")
}