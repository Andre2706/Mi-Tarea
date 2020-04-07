package com.example.usandowidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.onclickListener {

    private lateinit var txtNombre: EditText
    private lateinit var btnSaluda: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNombre = findViewById(R.id.btn_saluda)
        btnSaluda = findViewById(R.id.btn_saluda)

        btnSaluda.setOnClickListener(this)
    }
    Override fun onClick(v: View?){

        var nombre = txtNombre.text
        Toast.makeText(this,"que tal", Toast.LENGTH_SHORT).show()
    }
}
