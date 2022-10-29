package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BreadStep2_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bread_step21)

        val nextPageBtn = findViewById<View>(R.id.button) as Button
        nextPageBtn.setOnClickListener{
            val intent = Intent()
            intent.setClass(this@BreadStep2_1, BreadStep2_2::class.java)
            startActivity(intent)
        }
        val itemBtn = findViewById<View>(R.id.button0) as Button
        itemBtn.setOnClickListener{
            val intent = Intent()
            intent.setClass(this@BreadStep2_1, BreadStep2_0::class.java)
            startActivity(intent)
        }
    }
}