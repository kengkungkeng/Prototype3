package com.example.prototype3.Vascular.S3.Vascular9S3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Vascular9S3AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Vascular9S3NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}