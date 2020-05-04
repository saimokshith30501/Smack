package com.example.smack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun signupclick(view: View){
      var sup:Intent= Intent(this,Signup::class.java)
        startActivity(sup)
    }

    fun signinclick(view: View){

    }
}
