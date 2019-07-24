package com.example.prototype3.Vascular.S2.Vascular1S2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Vascular1S2AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Vascular1S2NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}