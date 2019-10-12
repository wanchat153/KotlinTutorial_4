import com.example.kotlintutorial_4.*

fun main(args: Array<String>){

    val enemy = Enemy("test enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)
}