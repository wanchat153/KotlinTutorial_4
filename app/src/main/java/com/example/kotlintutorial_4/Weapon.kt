package com.example.kotlintutorial_4

class Weapon(val name: String, var damageInfLicted: Int){

    override fun toString(): String {
        return "$name inflicts $damageInfLicted points of damage"
    }
}