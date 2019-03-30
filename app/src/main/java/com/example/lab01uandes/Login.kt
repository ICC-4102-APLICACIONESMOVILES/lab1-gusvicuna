package com.example.lab01uandes

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.btn_login)
        val email = findViewById<EditText>(R.id.email)

        button.setOnClickListener {
            if (isEmailValid(email.text.toString())){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("result",email.text.toString());
                setResult(Activity.RESULT_OK,intent);
                finish()
            } else {
                Toast.makeText(this, "Please enter a valid e-mail.", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
