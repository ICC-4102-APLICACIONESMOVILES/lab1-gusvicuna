package com.example.lab01uandes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE





class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
    }
}
