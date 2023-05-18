package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityLainnyaBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class LainnyaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLainnyaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityLainnyaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // mengarahkan active indicator ke menu home
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bvMenu)
        bottomNavigationView.selectedItemId = R.id.Lainnya

        //Membuat link dari Navbar Bottom
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
                    val intent = Intent(this, LainnyaActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }
}