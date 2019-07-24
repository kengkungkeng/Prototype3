package com.example.prototype3

class sentToStatusDB(val id:String, val statusPatient: String, val detailshortStatusPatient:String,
                     val detaillongStatusList_patient:String, val Symptomp_patient:String, val Action_patient:String){
    constructor() : this("","","","","","")
}