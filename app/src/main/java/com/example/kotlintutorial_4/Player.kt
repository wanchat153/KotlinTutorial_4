package com.example.kotlintutorial_4

class Player (val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0){

    fun show(){
        println("""
            naem: $name
            lives: $lives
            level: $level
            score: $score
            """)
    }
}