package com.example.practik11

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("ResourceType")
    fun onMyButtonClick(view: View?) {
        val photo:ImageView = findViewById(R.id.imageView2)
        val imageView:Int = R.drawable.pear
        photo.setImageResource(imageView)
    }
}


