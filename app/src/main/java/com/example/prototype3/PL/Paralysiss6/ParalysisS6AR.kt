package com.example.prototype3.PL.Paralysiss6

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ParalysisS6AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, ParalysisS6NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}