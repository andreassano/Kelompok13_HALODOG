package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding : ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}