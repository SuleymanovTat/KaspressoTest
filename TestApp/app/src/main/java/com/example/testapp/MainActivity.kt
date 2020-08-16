package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.buttonSend)
        btn.setOnClickListener {
            btn.text = "New test"
            startActivity(Intent(this, NextActivity::class.java))
        }
    }
}