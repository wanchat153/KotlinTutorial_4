package com.example.kotlintutorial_4

class Player (val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0){

    var weapon: Weapon = Weapon("Fist", 1)
    var inventory = ArrayList<Loot>()

    fun show(){
        if (lives > 0){
            println("$name is alive")
        }else{
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon.name}
            damage: ${weapon.damageInfLicted}
            """
    }

    fun showInventory(){
        println("$name'$ Inventory")
        println(inventory.get(0))
        println("========================")
    }
}