open class Human(val name: String? = null){
    val mana : Int? = null
    open fun attack(  ) {
        val Human = Human("Fist Attack!")
        println(Human.name) }
}

open class mage () :Human(null){

    override fun attack() {
        val Human = Human("Fireball!")
        println(Human.name)

    }
}

fun main()
{
    val obj = mage()
    obj.attack()


}