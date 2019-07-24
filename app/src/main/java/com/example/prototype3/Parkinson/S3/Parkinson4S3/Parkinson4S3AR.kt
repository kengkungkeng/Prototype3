package com.example.prototype3.Parkinson.S3.Parkinson4S3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Parkinson4S3AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Parkinson4S3NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}