package com.alikom.viewmodelpractice

import androidx.annotation.DrawableRes

data class Model(
    @DrawableRes val icon:Int,
    val name:String,
    val balance:String,
    val number:String
)