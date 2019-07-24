package com.example.prototype3.Parkinson.S2.Parkinson1S2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ParkinsonS2AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, ParkinsonS2NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}