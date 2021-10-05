fun main(){
    val names: Array<String> = arrayOf("Dries", "Sam", "Matthias", "Guillaume")
    val randomName = names.random()
    greeting(randomName)
}


fun greeting(randomName: String):String{
    println("Gooooodmorning ${randomName}")
    return ""
}


