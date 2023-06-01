package com.example.project1_71180278

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txVnmaBarang = findViewById<TextView>(R.id.textView)
        val nmaBarang = txVnmaBarang.text

        val txVhrgaBarang = findViewById<TextView>(R.id.textView4)
        val hrgaBrng = txVhrgaBarang.text

        val btnBeli = findViewById<Button>(R.id.button3)

        val i = Intent (this, KeduaHalaman :: class.java)
        startActivity(i)
    }
}