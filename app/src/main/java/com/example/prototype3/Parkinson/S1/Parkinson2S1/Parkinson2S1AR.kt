package com.example.prototype3.Parkinson.S1.Parkinson2S1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Parkinson2S1AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Parkinson2S1NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}