package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_list_patient.*
import kotlinx.android.synthetic.main.patien_c_patien.view.*

class List_patient : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_patient)


        fetchUsers()

        }
    companion object {
        val PATIENT_ID = "PATIENT_ID"
        val PATIENT_NAME = "PATIENT_NAME"
        val PATIENT_LASTNAME = "PATIENT_LASTNAME"
        val PATIENT_ADD = "PATIENT_ADD"
        val PATIENT_NAME_CARE = "PATIENT_NAME_CARE"
        val PATIENT_GENDER = "PATIENT_GENDER"
        val PATIENT_AGEE = "PATIENT_AGEE"
        val PATIENT_TEL_CARE = "PATIENT_TEL_CARE"
        val PATIENT_PIC = "PATIENT_PIC"
        val PATIENT_BD = "PATIENT_BD"

    }
    private fun fetchUsers(){
        val userId = FirebaseAuth.getInstance().uid
        Log.d("List_patient","My uid :$userId")
        val ref = FirebaseDatabase.getInstance().getReference("/Patient/$userId")
        ref.addListenerForSingleValueEvent(object : ValueEventListener{
            override fun onDataChange(p0: DataSnapshot) {
                val adapter = GroupAdapter<ViewHolder>()
                p0.children.forEach {
                    Log.d("List_patient",it.toString())
                    val user = it.getValue(sentToDbpatient::class.java)
                    if (user != null ){
                        adapter.add(UserItem(user))

                    }
                }

                adapter.setOnItemClickListener{ item, view ->
                    val userItem = item as UserItem
                    val intent = Intent(view.context, Detail_Show_For_Old_Patient::class.java)
                    intent.putExtra(PATIENT_NAME, userItem.user.name)
                    intent.putExtra(PATIENT_LASTNAME, userItem.user.lastname)
                    intent.putExtra(PATIENT_ADD, userItem.user.address)
                    intent.putExtra(PATIENT_NAME_CARE, userItem.user.namecare)
                    intent.putExtra(PATIENT_GENDER,userItem.user.geldle)
                    intent.putExtra(PATIENT_AGEE, userItem.user.age)
                    intent.putExtra(PATIENT_TEL_CARE, userItem.user.tel)
                    intent.putExtra(PATIENT_BD, userItem.user.bd)
                    intent.putExtra(PATIENT_PIC, userItem.user.imageuurl)
                    intent.putExtra(PATIENT_ID, userItem.user.id)

                    startActivity(intent)

                    finish()
                }

                patient_view.adapter = adapter
            }

            override fun onCancelled(p0: DatabaseError) {

            }
        })




    }
}

class UserItem(val user: sentToDbpatient): Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.name_text.text = user.name
        viewHolder.itemView.lastname_text.text = user.lastname
        Picasso.get().load(user.imageuurl).rotate(90f).into(viewHolder.itemView.image_list)
    }

    override fun getLayout(): Int {
        return R.layout.patien_c_patien
    }
}