package com.example.kotlintutorial

import android.util.Log

data class test(val name: String) {

    fun testCall(){
        Log.d(null, "Inside testCallMethod")
    }

    init
    {
        Log.d(null, "Inside CONSTRUCTOR")
    }
}