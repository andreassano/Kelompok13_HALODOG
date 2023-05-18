package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityMainBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var toolbar : MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toolbar = findViewById(R.id.topAppBar)

        // mengarahkan active indicator ke menu home
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bvMenu)
        bottomNavigationView.selectedItemId = R.id.Home


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
                }else -> false
            }
        }

        toolbar.setNavigationOnClickListener {
            // Handle navigation icon press
        }

        toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.email -> {
                    // Handle edit text press
                    true
                }
                R.id.notif -> {
                    // Handle favorite icon press
                    true
                }else -> false
            }
        }

        binding.btnPetFood.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }

        binding.Vitamin.setOnClickListener {
            val intent = Intent(this, VitaminActivity::class.java)
            startActivity(intent)
        }

        binding.btnPetShop.setOnClickListener {
            val intent = Intent(this, PetShopActivity::class.java)
            startActivity(intent)
        }

        binding.btnKonsul.setOnClickListener {
            val intent = Intent(this, KonsultasiDokterActivity::class.java)
            startActivity(intent)
        }

    }

}