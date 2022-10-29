package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BreadStep1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bread_step12)

        val nextPageBtn = findViewById<View>(R.id.button) as Button
        nextPageBtn.setOnClickListener{
            val intent = Intent()
            intent.setClass(this@BreadStep1_2, BreadStep1_3::class.java)
            startActivity(intent)
        }
        val itemBtn = findViewById<View>(R.id.button0) as Button
        itemBtn.setOnClickListener{
            val intent = Intent()
            intent.setClass(this@BreadStep1_2, BreadStep1_0::class.java)
            startActivity(intent)
        }
    }
}