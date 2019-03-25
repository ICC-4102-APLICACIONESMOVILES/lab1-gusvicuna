package com.example.lab01uandes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent



class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "com.example.Lab01Uandes.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val intent = Intent(this, Login::class.java)
        intent.putExtra(EXTRA_MESSAGE, "Redirecting")
        startActivity(intent)
    }
}
