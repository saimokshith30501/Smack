package com.example.smack.Controller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.R
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.*

class Signup : AppCompatActivity() {
    var userAvatar="profileDefault"
    var avatarColor="[0.5,0.5,0.5,1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun generateavatar(view: View){
     var random=Random()
     val r=random.nextInt(255)
        val g=random.nextInt(255)
        val b=random.nextInt(255)
        Avatar_signup.setBackgroundColor(Color.rgb(r,g,b))
    }

    fun createuser(view: View){

    }
    fun avatar(view: View){
     val random=Random()
        val color=random.nextInt(2)
        val avatar=random.nextInt(28)

        if(color==0){
            userAvatar="light$avatar"
        }
        else{
            userAvatar="dark$avatar"
        }
        val resourceid=resources.getIdentifier(userAvatar,"drawable",packageName)
        Avatar_signup.setImageResource(resourceid)
    }
}
