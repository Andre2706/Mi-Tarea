package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun saludar(view){
        Toast.makeText(this, "Hola desde Android",
                Toast.LENGTH_SHORT).show()
    }
}