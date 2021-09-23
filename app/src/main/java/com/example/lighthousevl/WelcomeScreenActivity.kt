package com.example.lighthousevl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.welcome_screen.*

class WelcomeScreenActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)
        start_button.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }
    }
}