package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioGroup
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_symptomm.*

class SymptommActivity : AppCompatActivity() {
    var r: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptomm)

        val name_de = intent.getStringExtra(New_input_Activity.PATIENT_NAME)
        val lastname_de = intent.getStringExtra(New_input_Activity.PATIENT_LASTNAME)
        val bd_de = intent.getStringExtra(New_input_Activity.PATIENT_BD)
        val add_de = intent.getStringExtra(New_input_Activity.PATIENT_ADD)
        val name_care_de = intent.getStringExtra(New_input_Activity.PATIENT_NAME_CARE)
        val tel_de = intent.getStringExtra(New_input_Activity.PATIENT_TEL_CARE)
        val age_de = intent.getStringExtra(New_input_Activity.PATIENT_AGE)
        val pic_de = intent.getStringExtra(New_input_Activity.PATIENT_PIC)
        val gender = intent.getStringExtra(New_input_Activity.PATIENT_GENDER)
        val patient_id = intent.getStringExtra(New_input_Activity.PATIENT_ID)
        val symptomm_de = intent.getStringExtra(New_input_Activity.Symptomm)
        val actionn_de = intent.getStringExtra(New_input_Activity.Actionn)

        Rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB1_1 -> r = r+0
                R.id.rB1_2 -> r = r+1
                R.id.rB1_3 -> r = r+2
            }




        })
        Rg2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB2_1 -> r = r+0
                R.id.rB2_2 -> r = r+1

            }




        })
        Rg3.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB3_1 -> r = r+0
                R.id.rB3_2 -> r = r+1
                R.id.rB3_3 -> r = r+2
                R.id.rB3_4 -> r = r+3
            }




        })
        Rg4.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB4_1 -> r = r+0
                R.id.rB4_2 -> r = r+1
                R.id.rB4_3 -> r = r+2
            }




        })
        Rg5.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB5_1 -> r = r+0
                R.id.rB5_2 -> r = r+1
                R.id.rB5_3 -> r = r+2
            }




        })
        Rg6.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB6_1 -> r = r+0
                R.id.rB6_2 -> r = r+1

            }




        })
        Rg7.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB7_1 -> r = r+0
                R.id.rB7_2 -> r = r+1
                R.id.rB7_3 -> r = r+2
            }




        })
        Rg8.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB8_1 -> r = r+0
                R.id.rB8_2 -> r = r+1
                R.id.rB8_3 -> r = r+2
                R.id.rB8_4 -> r = r+3
            }




        })
        Rg9.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB9_1 -> r = r+0
                R.id.rB9_2 -> r = r+1
                R.id.rB9_3 -> r = r+2
            }




        })
        Rg10.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{_, i ->
            when(i){
                R.id.rB10_1 -> r = r+0
                R.id.rB10_2 -> r = r+1
                R.id.rB10_3 -> r = r+2
            }




        })


        btn_save.setOnClickListener{
            Toast.makeText(this,"R = $r",Toast.LENGTH_SHORT).show()
            val str :String = when(r){
                0-> "สภาวะที่ 3"
                1-> "สภาวะที่ 3"
                2-> "สภาวะที่ 3"
                3-> "สภาวะที่ 3"
                4-> "สภาวะที่ 3"
                5-> "สภาวะที่ 2"
                6-> "สภาวะที่ 2"
                7-> "สภาวะที่ 2"
                8-> "สภาวะที่ 2"
                9-> "สภาวะที่ 1"
                10-> "สภาวะที่ 1"
                11-> "สภาวะที่ 1"
                12-> "สภาวะที่ 1"
                13-> "สภาวะที่ 1"
                14-> "สภาวะที่ 1"
                15-> "สภาวะที่ 1"
                16-> "สภาวะที่ 1"
                17-> "สภาวะที่ 1"
                18-> "สภาวะที่ 1"
                19-> "สภาวะที่ 1"
                20-> "สภาวะที่ 1"
                else -> "Not Matched"
            }
            val strr :String = when(r){
                0-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                1-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                2-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                3-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                4-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                5-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                6-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                7-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                8-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                9-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                10-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                11-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                12-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                13-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                14-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                15-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                16-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                17-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                18-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                19-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                20-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                else -> "Not Matched"
            }
           val rresult = r.toString()
           val detailshort = str
           val detaillong = strr
           val symptommmm = symptomm_de
           val actionnnn = actionn_de
           val patientID = patient_id
           val ref = FirebaseDatabase.getInstance().getReference("/Status/Day1/$patientID/")

           val statusID = ref.push().key
           val statuss = sentToStatusDB(statusID.toString(),rresult,detailshort,detaillong,symptommmm,actionnnn)

           ref.child(statusID.toString()).setValue(statuss).addOnCompleteListener{
               Log.d("Status_input","Upload All DATA SS")
               Log.d("Status_input","R = $rresult")
               Log.d("Status_input","DetailShort = $detailshort")
               Log.d("Status_input","DetailLong = $detaillong")
               Log.d("Status_input","PatientID = $patientID")*
               Log.d("Status_input","Patient_id = $patient_id")
               Log.d("Status_input","StatusID = $statusID")
               Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()

           }
            val intent = Intent(this, Detail_Show_For_New_Patient::class.java)
            intent.putExtra(PATIENT_ID, patient_id)
            intent.putExtra(PATIENT_NAME, name_de)
            intent.putExtra(PATIENT_LASTNAME, lastname_de)
            intent.putExtra(PATIENT_ADD, add_de)
            intent.putExtra(PATIENT_NAME_CARE, name_care_de)
            intent.putExtra(PATIENT_AGE, age_de)
            intent.putExtra(PATIENT_TEL_CARE, tel_de)
            intent.putExtra(PATIENT_PIC, pic_de)
            intent.putExtra(PATIENT_BD, bd_de)
            intent.putExtra(PATIENT_GENDER, gender)
            intent.putExtra(RESULLT,str)
            intent.putExtra(RESULLTT,strr)
            intent.putExtra(Symptommm,symptomm_de)
            intent.putExtra(Actionnn,actionn_de)

            startActivity(intent)

        }



    }
    companion object{
        val RESULLT = "RESULLT"
        val RESULLTT = "RESULLTT"
        val PATIENT_ID = "PATIENT_ID"
        val PATIENT_NAME = "PATIENT_NAME"
        val PATIENT_LASTNAME = "PATIENT_LASTNAME"
        val PATIENT_ADD = "PATIENT_ADD"
        val PATIENT_NAME_CARE = "PATIENT_NAME_CARE"
        val PATIENT_AGE = "PATIENT_AGE"
        val PATIENT_TEL_CARE = "PATIENT_TEL_CARE"
        val PATIENT_PIC = "PATIENT_PIC"
        val PATIENT_BD = "PATIENT_BD"
        val PATIENT_GENDER = "PATIENT_GENDER"
        val Symptommm = "Symptommm"
        val Actionnn = "Actionnn"

    }
}




