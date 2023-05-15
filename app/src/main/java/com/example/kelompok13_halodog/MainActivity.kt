package com.example.kelompok13_halodog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navbar : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navbar = findViewById(R.id.bvMenu)

        navbar.setOnItemSelectedListener {item ->
            when(item.itemId){
                R.id.Profil -> {
                    true
                }
                R.id.Home -> {
                    true
                }
                R.id.Lainnya -> {
                    true
                }else -> false
            }
        }
    }

}