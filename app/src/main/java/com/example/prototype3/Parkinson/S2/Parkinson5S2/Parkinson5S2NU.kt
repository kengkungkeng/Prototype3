package com.example.prototype3.Parkinson.S2.Parkinson5S2

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import java.util.*
class Parkinson5S2NU {
    fun setNotification(timeInMilliSeconds: Long, activity: Activity) {

        //------------  alarm settings start  -----------------//

        if (timeInMilliSeconds > 0) {


            val alarmManager = activity.getSystemService(Activity.ALARM_SERVICE) as AlarmManager
            val alarmIntent = Intent(activity.applicationContext, Parkinson5S2AR::class.java) // AlarmReceiver1 = broadcast receiver

            alarmIntent.putExtra("reason", "notification")
            alarmIntent.putExtra("timestamp", timeInMilliSeconds)


            val calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR_OF_DAY,11)
            calendar.set(Calendar.MINUTE,58)
            calendar.set(Calendar.SECOND,0)
           // calendar.timeInMillis = timeInMilliSeconds


            val pendingIntent = PendingIntent.getBroadcast(activity, 0, alarmIntent, PendingIntent.FLAG_CANCEL_CURRENT)
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)

        }

        //------------ end of alarm settings  -----------------//


    }
}