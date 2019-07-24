package com.example.prototype3.Parkinson.S3.Parkinson8S3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Parkinson8S3AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Parkinson8S3NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}