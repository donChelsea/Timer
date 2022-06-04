package com.example.timer.data

class TimerData {

    companion object {
        val numbers0to23: MutableList<String> = IntRange(0, 23).map { it.toString() }.toMutableList()
        val numbers0to59: MutableList<String> = IntRange(0, 59).map { it.toString() }.toMutableList()
    }

}