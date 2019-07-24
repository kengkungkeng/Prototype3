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
            val intent = Intent(this,List_patient::class.java)
            startActivity(intent)
        }



        input_new_btn.setOnClickListener {
            val intent = Intent(this,New_input_Activity::class.java)
            startActivity(intent)
            //Detail_input
        }
    }
}
