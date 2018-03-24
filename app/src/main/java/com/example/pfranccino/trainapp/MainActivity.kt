package com.example.pfranccino.trainapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_secon.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




     button.setOnClickListener {
         startActivity(this ,SeconActivity::class.java)
     }

    }

    fun startActivity(activity : Activity, seconActivity: Class<*> ) {

        //explicit intent

        val intent = Intent(activity,seconActivity)
        intent.putExtra("Saludo","Wena ctmre")
        activity.startActivity(intent)


    }

}
