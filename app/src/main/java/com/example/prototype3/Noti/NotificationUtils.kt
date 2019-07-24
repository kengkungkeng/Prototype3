package com.example.prototype3.Noti

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import java.util.*
class NotificationUtils {

    fun setNotification(timeInMilliSeconds: Long, activity: Activity) {

        //------------  alarm settings start  -----------------//

        if (timeInMilliSeconds > 0) {


               val alarmManager = activity.getSystemService(Activity.ALARM_SERVICE) as AlarmManager
               val alarmIntent = Intent(activity.applicationContext, AlarmReceiver::class.java)
               // AlarmReceiver1 = broadcast receiver

               alarmIntent.putExtra("reason", "notification")
               alarmIntent.putExtra("timestamp", timeInMilliSeconds)

            val calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR_OF_DAY,21)
            calendar.set(Calendar.MINUTE,48)
            calendar.set(Calendar.SECOND,40)
                   // calendar.timeInMillis = timeInMilliSeconds
            val pendingIntent =
            PendingIntent.getBroadcast(activity, 0, alarmIntent, PendingIntent.FLAG_CANCEL_CURRENT)
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)





        }



    }
}