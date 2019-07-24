package com.example.prototype3.PL.S3.Paralysiss1S3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Paralysiss1S3AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Paralysiss1S3NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}