package com.dalvik.sadnwichbuilderpattern

class SandwichBuilder {
    public fun build(sandwich: Sandwich, ingredient: Ingredient) : Sandwich {
        sandwich.addIngredient(ingredient)
        return sandwich
    }
}