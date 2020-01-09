package com.example.demodagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine,val wheels: Wheels) {

    fun drive(){
         Log.d("msg","driving...")
    }
}