package com.example.prototype3.PL.S1.Paralysiss

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import com.example.prototype3.PL.S1.Paralysiss.ParalysisS1AR
import java.util.*
class ParalysisS1NU {

    fun setNotification(timeInMilliSeconds: Long, activity: Activity) {

        //------------  alarm settings start  -----------------//

        if (timeInMilliSeconds > 0) {


               val alarmManager = activity.getSystemService(Activity.ALARM_SERVICE) as AlarmManager
               val alarmIntent = Intent(activity.applicationContext, ParalysisS1AR::class.java)
               // AlarmReceiver1 = broadcast receiver

               alarmIntent.putExtra("reason", "notification")
               alarmIntent.putExtra("timestamp", timeInMilliSeconds)

            val calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR_OF_DAY,6)
            calendar.set(Calendar.MINUTE,58)
            calendar.set(Calendar.SECOND,0)
                   // calendar.timeInMillis = timeInMilliSeconds
            val pendingIntent =
            PendingIntent.getBroadcast(activity, 0, alarmIntent, PendingIntent.FLAG_CANCEL_CURRENT)
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)





        }



    }
}