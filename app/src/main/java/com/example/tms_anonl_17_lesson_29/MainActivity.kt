package com.example.tms_anonl_17_lesson_29

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val User_PREFERENCE="USER_PREFERENCE"
    private val UID_PRHONE="uid_phone"
    private val sharedPreferences:SharedPreferences=
        getSharedPreferences()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}