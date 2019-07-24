package com.example.prototype3

import android.content.Intent
import android.net.MailTo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class Splash_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java) //MainActivity NotificateActivity
            startActivity(intent)
        },3000)

    }
}
