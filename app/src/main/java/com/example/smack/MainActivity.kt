package com.example.smack
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }

    }
    fun loginbutton_nav_clicked(view: View){
       Snackbar.make(view,"Login Clicked",Snackbar.LENGTH_SHORT).show()
    }

    fun addchannel(view: View){
        Snackbar.make(view,"Add Channel Clicked",Snackbar.LENGTH_SHORT).show()
    }

    fun sendmsgclicked(view: View){
        lateinit var disp:String
        disp= Message_textfield.text.toString()
        Snackbar.make(view,"Text->$disp",Snackbar.LENGTH_SHORT).show()
    }

}
