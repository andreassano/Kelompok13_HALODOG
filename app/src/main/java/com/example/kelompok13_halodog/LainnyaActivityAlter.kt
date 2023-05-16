package com.example.kelompok13_halodog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kelompok13_halodog.databinding.ActivityLainnyaBinding

class LainnyaActivityAlter : AppCompatActivity() {
    lateinit var binding: ActivityLainnyaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLainnyaBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}