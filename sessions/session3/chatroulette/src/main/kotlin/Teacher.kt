class Teacher(override val name:String): Person(name), ChatPartner{

    override fun talk(){
        funfact()
    }

    fun funfact(){
        println("Der was eens nen hollander, nen belg en nen fransman")
    }
}