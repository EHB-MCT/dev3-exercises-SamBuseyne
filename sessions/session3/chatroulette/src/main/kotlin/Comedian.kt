class Comedian(override val name:String): Person(name), ChatPartner {
    override fun talk(){
        joke()
    }

    fun joke(){
        println("ken je den mop van den duim")
    }
}