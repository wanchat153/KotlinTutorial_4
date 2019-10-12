package com.example.kotlintutorial_4

class Vampyre(name: String) : Enemy(name, 20,3) {

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}