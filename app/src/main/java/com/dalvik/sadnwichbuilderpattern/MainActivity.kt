package com.dalvik.sadnwichbuilderpattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var builder: SandwichBuilder
    lateinit var sandwich: Sandwich
    lateinit var bagel: RadioButton
    lateinit var baguette: RadioButton
    lateinit var ham: CheckBox
    lateinit var cheese: CheckBox
    lateinit var salt: Switch

    lateinit var textOrder : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()

    }

    fun initData() {
        bagel = findViewById(R.id.radio_baguele)
        baguette = findViewById(R.id.radio_baguette)
        ham = findViewById(R.id.check_ham)
        cheese = findViewById(R.id.check_cheese)
        salt = findViewById(R.id.switch_salt)

        textOrder = findViewById(R.id.textview_order)
    }

    fun actionOkClicked(view : View) {
        builder = SandwichBuilder()
        sandwich = Sandwich()
        if(bagel.isChecked)
            sandwich = builder.build(sandwich, Bagel())
        else if (baguette.isChecked)
            sandwich = builder.build(sandwich, Baguette())

        if(ham.isChecked)
            sandwich = builder.build(sandwich, Ham())

        if(cheese.isChecked)
            sandwich = builder.build(sandwich, Cheese())

        if(salt.isChecked)
            sandwich = builder.build(sandwich, Salt())

        textOrder.text = sandwich.getSandwich().toString().plus("\n Kcal:").plus(sandwich.getKCal())
    }
}
