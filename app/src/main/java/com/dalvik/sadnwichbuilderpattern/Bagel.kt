package com.dalvik.sadnwichbuilderpattern

class Bagel : Bread() {
    override fun description(): String {
        return "Rosquilla"
    }

    override fun kcal(): Int {
        return 280
    }
}