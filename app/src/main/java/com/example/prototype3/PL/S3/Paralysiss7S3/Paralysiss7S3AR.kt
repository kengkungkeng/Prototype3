package com.example.prototype3.PL.S3.Paralysiss7S3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Paralysiss7S3AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Paralysiss7S3NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}