package com.example.countdowntimer

import android.os.Bundle
import androidx.activity.ComponentActivity

import androidx.activity.enableEdgeToEdge
import com.example.countdowntimer.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
}



