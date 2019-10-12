package com.example.kotlintutorial_4

enum class LootType{
    POTION, RING, ARMOR
}
class Loot (val name: String, val type: LootType, val value: Double){
}