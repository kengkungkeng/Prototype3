package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_register_acc.*

class Register_acc : AppCompatActivity() {
    lateinit var mmail: EditText
    lateinit var ppass: EditText
    lateinit var nname: EditText
    lateinit var llastname: EditText
    lateinit var bbd: EditText
    lateinit var aaadress: EditText
    lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_acc)

        mmail = findViewById(R.id.mail_regis)
        ppass = findViewById(R.id.pass_regis)
        nname = findViewById(R.id.name_regis)
        llastname = findViewById(R.id.lastname_regis)
        bbd = findViewById(R.id.bd_regis)
        aaadress = findViewById(R.id.address_regis)
        radioGroup = findViewById(R.id.radioGroup)




    submit_btn.setOnClickListener {
        val email = mail_regis.text.toString()
        val pass = pass_regis.text.toString()
        val name = name_regis.text.toString()
        val lastname = lastname_regis.text.toString()
        val bd = bd_regis.text.toString()
        val address = aaadress.text.toString()



        if (email.isEmpty() || pass.isEmpty()|| name.isEmpty() || lastname.isEmpty()|| bd.isEmpty()|| address.isEmpty()){
            Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบ.", Toast.LENGTH_SHORT).show()
            return@setOnClickListener
        }

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,pass)
            .addOnCompleteListener {
                if (!it.isSuccessful) {


                    return@addOnCompleteListener
                }
                sentDb()

                val intent = Intent(this, Main_menu_for_new::class.java)
                startActivity(intent)

            }

            .addOnFailureListener {
                Toast.makeText(this,"สร้างบัญชีไม่สำเร็จ",Toast.LENGTH_SHORT).show()
                return@addOnFailureListener
            }


    }



  }

    private fun sentDb(){
        val mmmail = mmail.text.toString().trim()
        val pppass = ppass.text.toString().trim()
        val nnname = nname.text.toString().trim()
        val lllastname = llastname.text.toString().trim()
        val bbbd = bbd.text.toString().trim()
        val aaaaddress = aaadress.text.toString().trim()
        val valuetwo = radioGroup.checkedRadioButtonId
        val rb = findViewById<RadioButton>(valuetwo)
        val rbb = rb.text.toString().trim()

        val userId = FirebaseAuth.getInstance().uid
        val ref = FirebaseDatabase.getInstance().getReference("Users/$userId")


        val user = sentToDb(userId.toString(),mmmail,pppass,nnname,lllastname,bbbd,aaaaddress,rbb)

        ref.child(userId.toString()).setValue(user).addOnCompleteListener {
            Toast.makeText(this,"สร้างบัญชีผู้ใช้สำเร็จ",Toast.LENGTH_SHORT).show()
        }

    }

}
