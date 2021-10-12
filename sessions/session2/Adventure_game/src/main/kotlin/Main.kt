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
        challengeThree()
    }else{
        gameOver()
    }
}

fun gameOver(){
    println("Wrong, winter is coming!!!")
    println("You are now a member of the Army of the dead")
}

fun challengeThree(){
    println("You face a horde of zombies, choice a weapon to fight them or flee? Choose wisely")
    val options = setOf<String>("Axe","Wooden stock", "Sword", "Flee")
    println("Options: Axe, Wooden stock, Sword or Flee")
    val userOption = readLine()

    if(userOption == "Axe"){
        println("Good chose, you killed them all")

    }
    if(userOption == "Wooden stock"){
        println("Oof that was a close one")
    }

    if(userOption == "Sword"){
        println("They may rest in pieces")
    }
    if(userOption == "Flee"){
        println("Run you bloody fool!!")
    }



}
