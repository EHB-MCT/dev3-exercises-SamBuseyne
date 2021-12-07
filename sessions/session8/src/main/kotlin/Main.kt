fun main(){
    println("Kunde ne keer een taalke kiezen: en (Engels) - fr (Frans) - wv (West-Vlams)")
    val userLanguage = readLine()!!.toString();
    if(userLanguage == "en" || userLanguage == "fr" || userLanguage == "wv"){
        val duo = Duolingo(userLanguage);
    }else{
        throw Exception("Kuje alsjeblieft een twuk verstaanbaars intikken?")
    }
}