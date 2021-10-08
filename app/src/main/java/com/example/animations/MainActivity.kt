package com.example.animations

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var bartIsShowing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBart.setOnClickListener {
            fade()
        }
    }

    private fun fade() {
        Log.i("Info", "ImageView tapped")
        if (bartIsShowing) {
            bartIsShowing = false
            binding.ivBart.animate().alpha(0F).duration = 2000
            binding.ivHomer.animate().alpha(1F).duration = 2000
        } else {
            bartIsShowing = true
            binding.ivBart.animate().alpha(1F).duration = 2000
            binding.ivHomer.animate().alpha(0F).duration = 2000
        }


    }
}