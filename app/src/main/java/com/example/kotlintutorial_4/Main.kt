fun main(args: Array<String>){
//    println("Hello World")
//    println("My first Kotlin program")
//
//    val jim = "James T Kirk"
//    val tim = "Tim Buchalka"
//    println(tim)
//
//    val timsWeeklySalary: Int = 32
//    val timsMonthlySalary = timsWeeklySalary * 4
//    println("Tim' s $ weekly salary is $$timsWeeklySalary")
//    println("Monthly, that comes to $timsMonthlySalary")
//
//    println()
//
//    val apples = 6
//    val oranges = 5
//    val fruit = apples - oranges
//    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")
//
//    println("A quarter of the apples is ${apples / 4}")
//
//    println()
//    val weeks = 234
//    val years = weeks / 52.0
//    println("$weeks weeks in $years  years")
//
//    println("My name is $tim")
//    println("jim is $jim")

//    var lives = 0
//
//    var isGameOver = (lives < 1)
//    println(isGameOver)
//
//    if (isGameOver){
//        println("Game over!")
//    }else{
//        println("You're still alive!")
//    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val messenge: String
    messenge = when {
        age < 18 -> "You're too young to vote"
        age == 100 -> "Congratulations"
        else -> "You can vote"
    }

//    val messenge: String
//    messenge = if (age < 18){
//        "You're too young to vote"
//    }else if (age == 100){
//        "Congratulations"
//    }else{
//        "You can vote"
//    }

    println(messenge)
}