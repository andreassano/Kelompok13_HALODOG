package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.kelompok13_halodog.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bvMenu.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Profil -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.Home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.Lainnya -> {
                    true
                }else -> false
            }
        }

        binding.buttonLogout.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
    }
}