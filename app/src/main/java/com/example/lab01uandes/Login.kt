package com.example.lab01uandes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    val button = findViewById<Button>(R.id.btn_login)
    fun logIn(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
    }
}
