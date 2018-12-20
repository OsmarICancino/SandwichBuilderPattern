package com.dalvik.sadnwichbuilderpattern

class Baguette : Bread() {
    override fun description(): String {
        return "Barra de pan"
    }

    override fun kcal(): Int {
        return 80
    }
}