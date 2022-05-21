package com.laurentdarl.quickyfood.presentation.activities.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.quickyfood.R
import com.laurentdarl.quickyfood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}