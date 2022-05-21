package com.laurentdarl.quickyfood.presentation.activities.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.laurentdarl.quickyfood.R
import com.laurentdarl.quickyfood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.app_container) as NavHostFragment
        val navController = navHost.navController
        setupActionBarWithNavController(navController)
    }
}