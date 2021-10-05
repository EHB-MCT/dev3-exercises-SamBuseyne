fun main(args: Array<String>){
    val options: Array<String> = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()

    print("Pick rock, paper or scissors: ")
    val userOption = readLine()
    println("Computer choice: ${computerChoice}")
    println("You're choice: ${userOption}")

    if (computerChoice == userOption){
        println("It's a draw!")
        return
    }

    val winMessage = "You won!"
    val loseMessage = "You lose!"

    when(computerChoice){
        "rock" -> if(userOption == "paper"){
            println(winMessage)
        }else(println(loseMessage))
        "paper" -> if(userOption == "scissors"){
            println(winMessage)
        }else(println(loseMessage))
        "scissors" -> if(userOption == "rocks"){
            println(winMessage)
        }else(println(loseMessage))


    }

}
