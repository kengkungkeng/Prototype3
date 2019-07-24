package com.example.prototype3

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.analytics.FirebaseAnalytics
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail__show.*


class Detail_Show_For_New_Patient : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__show)


        val name_de = intent.getStringExtra(SymptommActivity.PATIENT_NAME)
        val lastname_de = intent.getStringExtra(SymptommActivity.PATIENT_LASTNAME)
        val bd_de = intent.getStringExtra(SymptommActivity.PATIENT_BD)
        val add_de = intent.getStringExtra(SymptommActivity.PATIENT_ADD)
        val name_care_de = intent.getStringExtra(SymptommActivity.PATIENT_NAME_CARE)
        val tel_de = intent.getStringExtra(SymptommActivity.PATIENT_TEL_CARE)
        val age_de = intent.getStringExtra(SymptommActivity.PATIENT_AGE)
        val pic_de = intent.getStringExtra(SymptommActivity.PATIENT_PIC)
        val patient_id = intent.getStringExtra(SymptommActivity.PATIENT_ID)
        val gender = intent.getStringExtra(SymptommActivity.PATIENT_GENDER)
        val statuss_dd = intent.getStringExtra(SymptommActivity.RESULLT)
        val statuss_ddd = intent.getStringExtra(SymptommActivity.RESULLTT)
        val symptom_symp = intent.getStringExtra(SymptommActivity.Symptommm)
        val action_symp = intent.getStringExtra(SymptommActivity.Actionnn)


            Picasso.get().load(pic_de).into(image_detail3)
            name_detail.setText(name_de)
            lastname_detail.setText(lastname_de)
            gender_D.setText(gender)
            age_D.setText(age_de)
            bd_detail.setText(bd_de)
            add_detail.setText(add_de)
            name_care_detail.setText(name_care_de)
            tel_care_detail.setText(tel_de)
            status_de.setText(statuss_dd)
            detail_status.setText(statuss_ddd)
            actionn_symp.setText(action_symp)
            Log.d("DSFNP","$patient_id")
            Log.d("NAA","$action_symp")
            Log.d("NAA","$symptom_symp")


            alert_btn.setOnClickListener {
                val intent = Intent(this,NotificateActivity::class.java)
                intent.putExtra(Ssymptommmm,symptom_symp)
                intent.putExtra(Sstatuss,statuss_dd)
                startActivity(intent)
            }



    }
    companion object{
        val Ssymptommmm = "Ssymptommmm"
        val Sstatuss = "Sstatuss"
    }
}
