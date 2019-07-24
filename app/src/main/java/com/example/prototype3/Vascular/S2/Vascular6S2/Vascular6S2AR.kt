package com.example.prototype3.Vascular.S2.Vascular6S2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Vascular6S2AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Vascular6S2NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}