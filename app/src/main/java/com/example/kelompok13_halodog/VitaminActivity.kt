package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityVitaminBinding

class VitaminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVitaminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVitaminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}