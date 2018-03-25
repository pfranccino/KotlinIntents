package com.example.pfranccino.trainapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
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


     buttonCall.setOnClickListener {

        makeCall()

     }


    }

    fun startActivity(activity : Activity, seconActivity: Class<*> ) {

        //explicit intent

        val intent = Intent(activity,seconActivity)
        intent.putExtra("Saludo","Wena ctmre")
        activity.startActivity(intent)


    }

    fun makeCall(){

        val numberCall = editText2.text.toString()
        val intentCall = Intent(Intent.ACTION_DIAL , Uri.parse("tel:$numberCall"))
        startActivity(intentCall)
    }

}
