package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityKonsultasiDokterBinding

class KonsultasiDokterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKonsultasiDokterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKonsultasiDokterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}