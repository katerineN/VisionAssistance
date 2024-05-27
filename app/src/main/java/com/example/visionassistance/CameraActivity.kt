package com.example.visionassistance

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.visionassistance.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    finish()
                    true
                }
                R.id.navigation_camera -> {
                    // Already on camera screen
                    true
                }
                R.id.navigation_cloud -> {
                    val intent = Intent(this, ResultsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_galery -> {
                    // TODO: Add Profile Activity
                    true
                }
                else -> false
            }
        }
    }
}
