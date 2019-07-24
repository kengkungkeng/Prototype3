package com.example.prototype3.Parkinson.S1.Parkinson1S1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ParkinsonS1AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, ParkinsonS1NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}