open class Human(val name: String? = null){
    val mana : Any? =null
    open fun attack(  ) {
        val Human = Human("Fist Attack!")
        println(Human.name) 
    }
}

open class mage () :Human(null){
    override fun attack() {
        val Human = Human("Fire Ball!")
        println(Human.name)
    }
}

fun main(){
    val flag = Human().mana
    val obj = mage()
    obj.attack()
    when (flag){
        null -> println("I have no mana")
        else -> println("I have mana")
    }
}
