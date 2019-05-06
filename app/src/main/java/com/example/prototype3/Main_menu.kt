package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_menu.*

class Main_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        recive_old_btn.setOnClickListener{
            val intent = Intent(this,Listview_patient_new::class.java)
            startActivity(intent)
        }



        input_new_btn.setOnClickListener {
            val intent = Intent(this,Detail_input::class.java)
            startActivity(intent)
        }
    }
}
