package com.example.prototype3

import android.app.Activity
import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_detail_input_.*
import kotlinx.android.synthetic.main.activity_girl_input.*

import java.util.*


class New_input_Activity : AppCompatActivity(){
    lateinit var nnamepatient: EditText
    lateinit var option : Spinner
    lateinit var optionn : Spinner
    lateinit var llastnamepatient: EditText
    lateinit var bbd: EditText
    lateinit var aaadress: EditText
    lateinit var nnamecare: EditText
    lateinit var ttelcare: EditText
    lateinit var radioGroup: RadioGroup
    lateinit var agee: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_input_)

        nnamepatient = findViewById(R.id.name_patient2)
        llastnamepatient = findViewById(R.id.lastname_patient2)
        bbd = findViewById(R.id.bd_patient2)
        aaadress = findViewById(R.id.address_patient2)
        nnamecare = findViewById(R.id.namecare_patient2)
        ttelcare = findViewById(R.id.telcare_patient2)
        radioGroup = findViewById(R.id.radioGroup77)
        agee = findViewById(R.id.age_patient)
        img_p_upload2.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent,0)
        }

        detail_input_DB.setOnClickListener {
            checkblank()
        }



        option = findViewById(R.id.spinner) as Spinner


        val options = arrayListOf("กรุณาเลือกโรค","โรคหลอดเลือด","โรคพาร์กินสัน","โรคอัมพฤกษ์-อัมพาต")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }
        }


        optionn = findViewById(R.id.spinner2) as Spinner

        val optionss = arrayListOf("กรุณาเลือกอาการแทรกซ้อน","ภาวะกลืนลำบาก","อาการชัก","แผลกดทับ")


        optionn.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionss)

        optionn.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

        }



    }
    companion object {
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

        val Symptomm = "Symptomm"
        val Actionn = "Actionn"

    }


    private fun checkblank(){
        val nnamepatientt = nnamepatient.text.toString()
        val llastnamepatientt = llastnamepatient.text.toString()
        val bbdd = bbd.text.toString()
        val aaadresss = aaadress.text.toString()

        val nnamecaree = nnamecare.text.toString()
        val tttelcare = ttelcare.text.toString()
        val aagee = agee.text.toString()

        if (nnamepatientt.isEmpty() || llastnamepatientt.isEmpty()|| bbdd.isEmpty() || aaadresss.isEmpty()|| aaadresss.isEmpty()|| nnamecaree.isEmpty()|| tttelcare.isEmpty()|| aagee.isEmpty()){
            Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบ.", Toast.LENGTH_SHORT).show()

            return
        }else{
            imageUpload()
        }

    }
    private fun sentDb(imageuurl: String){
        val nnnamepatient = nnamepatient.text.toString().trim()
        val lllastnamepatient = llastnamepatient.text.toString().trim()
        val bbbd = bbd.text.toString().trim()
        val aaaadress = aaadress.text.toString().trim()
        val nnnamecare = nnamecare.text.toString().trim()
        val tttelcare = ttelcare.text.toString().trim()
        val valuetwo = radioGroup.checkedRadioButtonId
        val rb = findViewById<RadioButton>(valuetwo)
        val rbb = rb.text.toString().trim()
        val aagee = agee.text.toString()
        val ooppo = option.selectedItem.toString()
        val ooppo2 = optionn.selectedItem.toString()

        val userId = FirebaseAuth.getInstance().uid
        val ref = FirebaseDatabase.getInstance().getReference("/Patient/$userId")

        val patientId = ref.push().key
        val patient = sentToDbpatient(patientId.toString(),nnnamepatient,lllastnamepatient,bbbd,aaaadress,nnnamecare,tttelcare,rbb,aagee,imageuurl)

        ref.child(patientId.toString()).setValue(patient).addOnCompleteListener {
            Log.d("DIDI","$ooppo , $ooppo2")
            Log.d("Detail_input","Upload All DATA SS")
            Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()
            Log.d("Detail_input","$patientId")

            val intent = Intent(this, SymptommActivity::class.java)
            intent.putExtra(PATIENT_ID, patientId)
            intent.putExtra(PATIENT_NAME, nnnamepatient)
            intent.putExtra(PATIENT_LASTNAME, lllastnamepatient)
            intent.putExtra(PATIENT_ADD, aaaadress)
            intent.putExtra(PATIENT_NAME_CARE, nnnamecare)
            intent.putExtra(PATIENT_AGE, aagee)
            intent.putExtra(PATIENT_TEL_CARE, tttelcare)
            intent.putExtra(PATIENT_PIC, imageuurl)
            intent.putExtra(PATIENT_BD, bbbd)
            intent.putExtra(PATIENT_GENDER, rbb)
            intent.putExtra(Symptomm, ooppo)
            intent.putExtra(Actionn, ooppo2)
            startActivity(intent)
        }


    }

    var selectedPhotoUri: Uri? = null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null){
            Log.d("Detail_input","Photo Select")

            selectedPhotoUri = data.data
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotoUri)
            image_detail2.setImageBitmap(bitmap)
            img_p_upload2.alpha = 0f



        }
    }
    private fun imageUpload() {
        if (selectedPhotoUri == null){
            Log.d("Detail_input","I AM HERE")
            return
        }
        val filename = UUID.randomUUID().toString()
        val ref = FirebaseStorage.getInstance().getReference("/images/$filename")
        ref.putFile(selectedPhotoUri!!)
            .addOnSuccessListener {
                Log.d("Detail_input","Upload SS : ${it.metadata?.path}")

                ref.downloadUrl.addOnSuccessListener {
                    Log.d("Detail_input","Location: $it")
                    sentDb(it.toString())
                }

            }
            .addOnFailureListener{

            }

    }


}



