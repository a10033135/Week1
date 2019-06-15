open class Human(val name: String? = null){
    open fun attack(  ) {
        val Human = Human("Fist Attack!")
        println(Human.name) }

}

fun main()
{
    val obj = Human()
    obj.attack()

}