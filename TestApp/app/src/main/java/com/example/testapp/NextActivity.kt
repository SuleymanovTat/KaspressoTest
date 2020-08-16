package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            startActivity(Intent(this, BottomNavigationActivity::class.java))
        }
    }
}