fun main(args: Array<String>){
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    playGame()
}

fun playGame(){
    print("Make a choice: ")
    val userInput = readLine()
    println("You're option is: $userInput")

    //val randomNumber = (0..2).random()
    val randomNumber = 0

    if(randomNumber == 0){
        if(randomNumber.equals(userInput)){
            println("It's a draw")
        }else{
            println("You lose")
        }

    }
    if(randomNumber?.equals(other = userInput)){
        println("You failed: 1")
    }
    if(randomNumber == 2){
        println("Try again 2")
    }
}