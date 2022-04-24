package com.example.roomdemo

import android.app.Application

class EmployeeApp: Application() {
    // lazy means it loads the needed value to our variable whenever needed
    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }
}