package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail__show__for__old__patient.*

class Detail_Show_For_Old_Patient : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__show__for__old__patient)

        val name_lp = intent.getStringExtra(List_patient.PATIENT_NAME)
        val lastname_lp = intent.getStringExtra(List_patient.PATIENT_LASTNAME)
        val address_lp = intent.getStringExtra(List_patient.PATIENT_ADD)
        val namecare_lp = intent.getStringExtra(List_patient.PATIENT_NAME_CARE)
        val gender_lp = intent.getStringExtra(List_patient.PATIENT_GENDER)
        val agee_lp = intent.getStringExtra(List_patient.PATIENT_AGEE)
        val tel_lp = intent.getStringExtra(List_patient.PATIENT_TEL_CARE)
        val bd_lp = intent.getStringExtra(List_patient.PATIENT_BD)
        val pic_lp = intent.getStringExtra(List_patient.PATIENT_PIC)
        val patient_iid = intent.getStringExtra(List_patient.PATIENT_ID)


        val ref = FirebaseDatabase.getInstance().getReference("/Status/Day1/$patient_iid")
        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDataChange(p0: DataSnapshot) {
                p0.children
                    .forEach{
                        val sympp:String = it.child("symptomp_patient").getValue().toString()
                        val actionn:String = it.child("action_patient").getValue().toString()
                        val detaillong:String = it.child("detaillongStatusList_patient").getValue().toString()
                        val detailshort:String = it.child("detailshortStatusPatient").getValue().toString()

                        symtomp_de_old.setText(sympp)
                        action_symptom.setText(actionn)
                        output_status.setText(detailshort)
                        long_status_patient.setText(detaillong)
                        btn_notificate.setOnClickListener {
                            val intent = Intent(this@Detail_Show_For_Old_Patient,Notificate_OldActivity::class.java)
                            intent.putExtra(Symptommmm,sympp)
                            intent.putExtra(statussss,detailshort)
                            startActivity(intent)

                        }
                    }

            }


        })
        edit_bbtn.setOnClickListener {
            val intent = Intent(this,Edit_Old_Patient::class.java)
            intent.putExtra(PATIENT_ID, patient_iid)
            startActivity(intent)

        }


        Picasso.get().load(pic_lp).into(image_detail)
        output_name.setText(name_lp)
        output_lastname.setText(lastname_lp)
        gender_out.setText(gender_lp)
        aaggee_out.setText(agee_lp)
        output_bd.setText(bd_lp)
        output_address.setText(address_lp)
        output_care.setText(namecare_lp)
        output_phonecare.setText(tel_lp)



        btn_evaluation.setOnClickListener { val intent = Intent(this,SymptommActivity::class.java)
        startActivity(intent)}



    }
    companion object {
        val PATIENT_ID = "PATIENT_ID"
        val Symptommmm = "Symptommmm"
        val statussss = "statussss"

    }



}

