package com.laurentdarl.quickyfood.presentation.activities.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.laurentdarl.quickyfood.R
import com.laurentdarl.quickyfood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setSupportActionBar(binding.mainToolbar)

        // Obtain the FirebaseAnalytics instance.
        firebaseAnalytics = Firebase.analytics

        appBarConfiguration = AppBarConfiguration(
            setOf()
        )

        val navHost = supportFragmentManager.findFragmentById(R.id.app_container) as NavHostFragment
        val navController = navHost.navController
        setupActionBarWithNavController(navController, appBarConfiguration)
//        binding.mainToolbar.setupWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp() = Navigation.findNavController(
        this, R.id.app_container
    ).navigateUp()
}