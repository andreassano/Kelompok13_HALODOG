package com.example.kelompok13_halodog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.kelompok13_halodog.databinding.ActivitySplashScreenBinding
import com.google.android.material.progressindicator.CircularProgressIndicator

class SplashScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    private lateinit var circularProgressIndicator : CircularProgressIndicator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        circularProgressIndicator = findViewById(R.id.circularProgress)

        // Set the Circular Progress indicator to indeterminate mode
        circularProgressIndicator.isIndeterminate = true

        Handler(Looper.getMainLooper()).postDelayed({
            //Intent memulai MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            //tutup activity
            finish()
        }, 3000)

    }
}