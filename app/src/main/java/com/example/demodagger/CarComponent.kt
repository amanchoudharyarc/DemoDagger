package com.example.demodagger

import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
}