import com.example.kotlintutorial_4.Loot
import com.example.kotlintutorial_4.LootType
import com.example.kotlintutorial_4.Player
import com.example.kotlintutorial_4.Weapon

fun main(args: Array<String>){
//    val tim = Player("Tim")
//    tim.show()
//
//    val louise = Player("Louise", 5)
//    louise.show()
//
//    val gr8 = Player("gr8", 4, 8)
//    val one2wach = Player("Ace", 2, 5, 1000)
//    gr8.show()
//    one2wach.show()
//    println(one2wach.weapon.name.toUpperCase())
//    println(one2wach.weapon.damageInfLicted)
//
//    val axe = Weapon("Axe", 12)
//    gr8.weapon = axe
//    println(gr8.weapon.name)
//    println(axe.name)
//
//    axe.damageInfLicted = 24
//    println(axe.damageInfLicted)
//    println(gr8.weapon.damageInfLicted)
//
//    tim.weapon = Weapon("Sword", 10)
////    println(tim.weapon.name)
//    tim.show()
//
//    louise.weapon = tim.weapon
//    louise.show()
//
//    tim.weapon = Weapon("Spear", 14)
////    println(tim.weapon.name)
//    tim.show()
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    tim.inventory.add(redPotion)
//    val chesArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
//    tim.inventory.add(chesArmor)
//    tim.showInventory()
//
//    tim.inventory.add(Loot("Ring of Protection +2", LootType.RING, 40.25))
//    tim.inventory.add(Loot("Inventory Potion", LootType.POTION, 35.95))
//    tim.showInventory()
//
//    println(tim.toString())
    for (i in 10 downTo 0 step 2){
        println("$i squared is ${i * i}")
    }

    for (value in 3..100 step 3){
        if (value % 5 == 0){
            println(value)
        }
    }
}