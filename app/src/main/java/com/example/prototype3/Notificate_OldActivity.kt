package com.example.prototype3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.prototype3.PL.S1.Paralysiss.ParalysisS1NU
import com.example.prototype3.PL.S1.Paralysiss2.ParalysisS2NU
import com.example.prototype3.PL.S1.Paralysiss3.ParalysisS3NU
import com.example.prototype3.PL.S1.Paralysiss4.ParalysisS4NU
import com.example.prototype3.PL.S1.Paralysiss5.ParalysisS5NU
import com.example.prototype3.PL.S1.Paralysiss6.ParalysisS6NU
import com.example.prototype3.PL.S1.Paralysiss7.ParalysisS7NU
import com.example.prototype3.PL.S1.Paralysiss8.ParalysisS8NU
import com.example.prototype3.PL.S1.Paralysiss9.ParalysisS9NU
import com.example.prototype3.PL.S2.Paralysiss2S2.Paralysiss2S1NU
import com.example.prototype3.PL.S2.Paralysiss3S2.Paralysiss3S1NU
import com.example.prototype3.PL.S2.Paralysiss4S2.Paralysiss4S1NU
import com.example.prototype3.PL.S2.Paralysiss5S2.Paralysiss5S1NU
import com.example.prototype3.PL.S2.Paralysiss6S2.Paralysiss6S1NU
import com.example.prototype3.PL.S2.Paralysiss7S2.Paralysiss7S1NU
import com.example.prototype3.PL.S2.Paralysiss8S2.Paralysiss8S1NU
import com.example.prototype3.PL.S2.Paralysiss9S2.Paralysiss9S1NU
import com.example.prototype3.PL.S2.ParalysissS2.ParalysissS1NU
import com.example.prototype3.PL.S3.Paralysiss1S3.Paralysiss1S3NU
import com.example.prototype3.PL.S3.Paralysiss2S3.Paralysiss2S3NU
import com.example.prototype3.PL.S3.Paralysiss3S3.Paralysiss3S3NU
import com.example.prototype3.PL.S3.Paralysiss4S3.Paralysiss4S3NU
import com.example.prototype3.PL.S3.Paralysiss5S3.Paralysiss5S3NU
import com.example.prototype3.PL.S3.Paralysiss6S3.Paralysiss6S3NU
import com.example.prototype3.PL.S3.Paralysiss7S3.Paralysiss7S3NU
import com.example.prototype3.PL.S3.Paralysiss8S3.Paralysiss8S3NU
import com.example.prototype3.PL.S3.Paralysiss9S3.Paralysiss9S3NU
import com.example.prototype3.Parkinson.S1.Parkinson1S1.ParkinsonS1NU
import com.example.prototype3.Parkinson.S1.Parkinson2S1.Parkinson2S1NU
import com.example.prototype3.Parkinson.S1.Parkinson3S1.Parkinson3S1NU
import com.example.prototype3.Parkinson.S1.Parkinson4S1.Parkinson4S1NU
import com.example.prototype3.Parkinson.S1.Parkinson5S1.Parkinson5S1NU
import com.example.prototype3.Parkinson.S1.Parkinson6S1.Parkinson6S1NU
import com.example.prototype3.Parkinson.S1.Parkinson7S1.Parkinson7S1NU
import com.example.prototype3.Parkinson.S1.Parkinson8S1.Parkinson8S1NU
import com.example.prototype3.Parkinson.S1.Parkinson9S1.Parkinson9S1NU
import com.example.prototype3.Parkinson.S2.Parkinson1S2.ParkinsonS2NU
import com.example.prototype3.Parkinson.S2.Parkinson2S2.Parkinson2S2NU
import com.example.prototype3.Parkinson.S2.Parkinson3S2.Parkinson3S2NU
import com.example.prototype3.Parkinson.S2.Parkinson4S2.Parkinson4S2NU
import com.example.prototype3.Parkinson.S2.Parkinson5S2.Parkinson5S2NU
import com.example.prototype3.Parkinson.S2.Parkinson6S2.Parkinson6S2NU
import com.example.prototype3.Parkinson.S2.Parkinson7S2.Parkinson7S2NU
import com.example.prototype3.Parkinson.S2.Parkinson8S2.Parkinson8S2NU
import com.example.prototype3.Parkinson.S2.Parkinson9S2.Parkinson9S2NU
import com.example.prototype3.Parkinson.S3.Parkinson1S3.ParkinsonS3NU
import com.example.prototype3.Parkinson.S3.Parkinson2S3.Parkinson2S3NU
import com.example.prototype3.Parkinson.S3.Parkinson3S3.Parkinson3S3NU
import com.example.prototype3.Parkinson.S3.Parkinson4S3.Parkinson4S3NU
import com.example.prototype3.Parkinson.S3.Parkinson5S3.Parkinson5S3NU
import com.example.prototype3.Parkinson.S3.Parkinson6S3.Parkinson6S3NU
import com.example.prototype3.Parkinson.S3.Parkinson7S3.Parkinson7S3NU
import com.example.prototype3.Parkinson.S3.Parkinson8S3.Parkinson8S3NU
import com.example.prototype3.Parkinson.S3.Parkinson9S3.Parkinson9S3NU
import com.example.prototype3.Vascular.S1.Vascular1S1.Vascular1S1NU
import com.example.prototype3.Vascular.S1.Vascular2S1.Vascular2S1NU
import com.example.prototype3.Vascular.S1.Vascular3S1.Vascular3S1NU
import com.example.prototype3.Vascular.S1.Vascular4S1.Vascular4S1NU
import com.example.prototype3.Vascular.S1.Vascular5S1.Vascular5S1NU
import com.example.prototype3.Vascular.S1.Vascular6S1.Vascular6S1NU
import com.example.prototype3.Vascular.S1.Vascular7S1.Vascular7S1NU
import com.example.prototype3.Vascular.S1.Vascular8S1.Vascular8S1NU
import com.example.prototype3.Vascular.S1.Vascular9S1.Vascular9S1NU
import com.example.prototype3.Vascular.S2.Vascular1S2.Vascular1S2NU
import com.example.prototype3.Vascular.S2.Vascular2S2.Vascular2S2NU
import com.example.prototype3.Vascular.S2.Vascular3S2.Vascular3S2NU
import com.example.prototype3.Vascular.S2.Vascular4S2.Vascular4S2NU
import com.example.prototype3.Vascular.S2.Vascular5S2.Vascular5S2NU
import com.example.prototype3.Vascular.S2.Vascular6S2.Vascular6S2NU
import com.example.prototype3.Vascular.S2.Vascular7S2.Vascular7S2NU
import com.example.prototype3.Vascular.S2.Vascular8S2.Vascular8S2NU
import com.example.prototype3.Vascular.S2.Vascular9S2.Vascular9S2NU
import com.example.prototype3.Vascular.S3.Vascular1S3.Vascular1S3NU
import com.example.prototype3.Vascular.S3.Vascular2S3.Vascular2S3NU
import com.example.prototype3.Vascular.S3.Vascular3S3.Vascular3S3NU
import com.example.prototype3.Vascular.S3.Vascular4S3.Vascular4S3NU
import com.example.prototype3.Vascular.S3.Vascular5S3.Vascular5S3NU
import com.example.prototype3.Vascular.S3.Vascular6S3.Vascular6S3NU
import com.example.prototype3.Vascular.S3.Vascular7S3.Vascular7S3NU
import com.example.prototype3.Vascular.S3.Vascular8S3.Vascular8S3NU
import com.example.prototype3.Vascular.S3.Vascular9S3.Vascular9S3NU
import kotlinx.android.synthetic.main.activity_notificate.*
import java.util.*

class Notificate_OldActivity : AppCompatActivity() {
    private val mNotificationTime = Calendar.getInstance().timeInMillis + 5000 //Set after 5 seconds from the current time.
    // private var mNotified = false

    val checksymptom = "โรคหลอดเลือด"
    val checksymptom2 = "โรคพาร์กินสัน"
    val checksymptom3 = "โรคอัมพฤกษ์-อัมพาต"

    val getstatus1 = "สภาวะที่ 1"
    val getstatus2 = "สภาวะที่ 2"
    val getstatus3 = "สภาวะที่ 3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificate__old)


        val getstatus = intent.getStringExtra(Detail_Show_For_Old_Patient.statussss) // Get From Firebase
        val getsymptom = intent.getStringExtra(Detail_Show_For_Old_Patient.Symptommmm) // Get From Firebase
        symtomppp_noti.setText(getsymptom)
        status_noti.setText(getstatus)
        if (getsymptom.equals(checksymptom)){

            if (getstatus.equals(getstatus1)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                ParalysisS1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                ParalysisS2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                ParalysisS3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                ParalysisS4NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                ParalysisS5NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                ParalysisS6NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                ParalysisS7NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                ParalysisS8NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                ParalysisS9NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคหลอดเลือด สภาวะที่ 1")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }else if (getstatus.equals(getstatus2)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                ParalysissS1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Paralysiss2S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Paralysiss3S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Paralysiss4S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Paralysiss5S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Paralysiss6S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Paralysiss7S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Paralysiss8S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Paralysiss9S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคหลอดเลือด สภาวะที่ 2")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }else if (getstatus.equals(getstatus3)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                Paralysiss1S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Paralysiss2S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Paralysiss3S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Paralysiss4S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Paralysiss5S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Paralysiss6S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Paralysiss7S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Paralysiss8S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Paralysiss9S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคหลอดเลือด สภาวะที่ 3")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }


        }else if (getsymptom.equals(checksymptom2)){

            if (getstatus.equals(getstatus1)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                ParkinsonS1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Parkinson2S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Parkinson3S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Parkinson4S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Parkinson5S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Parkinson6S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Parkinson7S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Parkinson8S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Parkinson9S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคพาร์กินสัน สภาวะที่ 1")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }else if (getstatus.equals(getstatus2)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                ParkinsonS2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Parkinson2S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Parkinson3S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Parkinson4S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Parkinson5S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Parkinson6S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Parkinson7S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Parkinson8S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Parkinson9S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคพาร์กินสัน สภาวะที่ 2")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }else if (getstatus.equals(getstatus3)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                ParkinsonS3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Parkinson2S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Parkinson3S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Parkinson4S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Parkinson5S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Parkinson6S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Parkinson7S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Parkinson8S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Parkinson9S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคพาร์กินสัน สภาวะที่ 3")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }

        }else if (getsymptom.equals(checksymptom3)){

            if (getstatus.equals(getstatus1)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                Vascular1S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Vascular2S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Vascular3S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Vascular4S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Vascular5S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Vascular6S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Vascular7S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Vascular8S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Vascular9S1NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคอัมพฤกษ์-อัมพาต สภาวะที่ 1")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }else if (getstatus.equals(getstatus2)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                Vascular1S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Vascular2S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Vascular3S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Vascular4S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Vascular5S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Vascular6S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Vascular7S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Vascular8S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Vascular9S2NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคอัมพฤกษ์-อัมพาต สภาวะที่ 2")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }else if (getstatus.equals(getstatus3)){
                btn_save_noti.setOnClickListener{
                    for (i in 1..9){
                        when (i){
                            1-> if (switch1_1.isChecked){
                                Vascular1S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            2-> if (switch1_2.isChecked){
                                Vascular2S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            3-> if (switch1_2.isChecked){
                                Vascular3S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            4-> if (switch1_2.isChecked){
                                Vascular4S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            5-> if (switch1_2.isChecked){
                                Vascular5S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            6-> if (switch1_2.isChecked){
                                Vascular6S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            7-> if (switch1_2.isChecked){
                                Vascular7S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            8-> if (switch1_2.isChecked){
                                Vascular8S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                            9-> if (switch1_2.isChecked){
                                Vascular9S3NU().setNotification(mNotificationTime, this@Notificate_OldActivity)
                            }

                        }

                    }
                    Log.d("NAA","โรคอัมพฤกษ์-อัมพาต สภาวะที่ 3")
                    Toast.makeText(this, "บันทึกแจ้งเตือน.", Toast.LENGTH_SHORT).show()
                }

            }
        }



        /* if (!mNotified) {
             NotificationUtils().setNotification(mNotificationTime, this@NotificateActivity)
             //---------------------------------------Paralysis S1-----------------------------------------//
             ParalysisS1NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS2NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS3NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS4NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS5NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS6NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS7NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS8NU().setNotification(mNotificationTime, this@NotificateActivity)
             ParalysisS9NU().setNotification(mNotificationTime, this@NotificateActivity)

             //---------------------------------------Paralysis S2-----------------------------------------//
             ParalysissS1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss2S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss3S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss4S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss5S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss6S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss7S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss8S1NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss9S1NU().setNotification(mNotificationTime, this@NotificateActivity)

             //---------------------------------------Paralysis S3-----------------------------------------//
             Paralysiss1S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss2S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss3S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss4S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss5S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss6S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss7S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss8S3NU().setNotification(mNotificationTime, this@NotificateActivity)
             Paralysiss9S3NU().setNotification(mNotificationTime, this@NotificateActivity)

             //---------------------------------------Parkinson S1-----------------------------------------//
             ParkinsonS1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson2S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson3S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson4S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson5S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson6S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson7S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson8S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson9S1NU().setNotification(mNotificationTime,this@NotificateActivity)

             //---------------------------------------Parkinson S2-----------------------------------------//
             ParkinsonS2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson2S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson3S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson4S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson5S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson6S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson7S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson8S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson9S2NU().setNotification(mNotificationTime,this@NotificateActivity)

             //---------------------------------------Parkinson S3-----------------------------------------//
             ParkinsonS3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson2S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson3S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson4S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson5S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson6S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson7S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson8S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Parkinson9S3NU().setNotification(mNotificationTime,this@NotificateActivity)

             //---------------------------------------Vascular S1-----------------------------------------//
             Vascular1S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular2S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular3S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular4S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular5S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular6S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular7S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular8S1NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular9S1NU().setNotification(mNotificationTime,this@NotificateActivity)

             //---------------------------------------Vascular S2-----------------------------------------//
             Vascular1S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular2S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular3S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular4S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular5S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular6S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular7S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular8S2NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular9S2NU().setNotification(mNotificationTime,this@NotificateActivity)

             //---------------------------------------Vascular S3-----------------------------------------//
             Vascular1S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular2S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular3S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular4S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular5S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular6S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular7S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular8S3NU().setNotification(mNotificationTime,this@NotificateActivity)
             Vascular9S3NU().setNotification(mNotificationTime,this@NotificateActivity)
         }
         */

    }

}

