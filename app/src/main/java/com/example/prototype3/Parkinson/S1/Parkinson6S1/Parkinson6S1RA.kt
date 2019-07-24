package com.example.prototype3.Parkinson.S1.Parkinson6S1

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prototype3.R
import kotlinx.android.synthetic.main.activity_result.*

class Parkinson6S1RA: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        if (intent.getBooleanExtra("notification", false)) { //Just for confirmation
            txtTitleView.text = intent.getStringExtra("title")
            txtMsgView.text = intent.getStringExtra("message")

        }

    }
}

