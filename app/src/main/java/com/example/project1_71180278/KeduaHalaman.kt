package com.example.project1_71180278

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView

class KeduaHalaman:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_kedua)

        val txVnmaBarang2 = findViewById<TextView>(R.id.textView17)

        val nama = txVnmaBarang2.text


    }
}