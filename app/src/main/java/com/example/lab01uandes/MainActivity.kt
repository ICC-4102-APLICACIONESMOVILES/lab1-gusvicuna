package com.example.lab01uandes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.app.Activity
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "com.example.Lab01Uandes.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, Login::class.java)
        intent.putExtra(EXTRA_MESSAGE, "Redirecting")
        startActivityForResult(intent,1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val emailtext= findViewById<TextView>(R.id.emailtext)
        val logbutton= findViewById<Button>(R.id.button2)

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val result = data!!.getStringExtra("result")
                emailtext.text= result
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                logbutton.text= resources.getString(R.string.login_btn)
            }
        }
    }//onActivityResult
}
