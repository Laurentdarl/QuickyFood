package com.laurentdarl.quickyfood.presentation.activities.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.quickyfood.R
import com.laurentdarl.quickyfood.presentation.activities.mainactivity.MainActivity
import com.laurentdarl.quickyfood.presentation.activities.onboarding.OnboardingActivity
import java.util.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(applicationContext, OnboardingActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 1500)
    }
}