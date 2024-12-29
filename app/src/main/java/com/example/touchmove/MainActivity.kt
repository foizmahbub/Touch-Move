package com.example.touchmove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.touchmove.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameView=GameView(this)
        binding.gameLayout.addView(gameView)
    }
}