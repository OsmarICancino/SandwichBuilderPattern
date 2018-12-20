package com.dalvik.sadnwichbuilderpattern

import java.lang.StringBuilder

class Sandwich {
    private var ingredients = arrayListOf<Ingredient>()

    public fun addIngredient(i : Ingredient) {
        ingredients.add(i)
    }

    public fun getKCal() : Int {
        var total = 0
        for(a in ingredients) {
            total += a.kcal()
        }

        return total
    }

    public fun getSandwich() : StringBuilder {

        val sandwichIngredients = StringBuilder()
        for (element in ingredients) {
            sandwichIngredients.append(element.description()).append("\n")
        }

        return sandwichIngredients
    }


}