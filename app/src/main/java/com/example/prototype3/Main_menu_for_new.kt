package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_menu.*
import kotlinx.android.synthetic.main.activity_main_menu_for_new.*

class Main_menu_for_new : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu_for_new)

        create_patient.setOnClickListener {
            val intent = Intent(this,New_input_Activity::class.java)
            startActivity(intent)

        }

    }
}
