package com.example.pfranccino.trainapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_secon.*

class SeconActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon)


        extractData()


        buttonEmail.setOnClickListener {

            sendEmail()
        }
    }

    private fun extractData() {

        // this method extracts data from the mainActivity

        val bundle = intent.extras
        val message_toast = getString(R.string.toast_message_activity)

        if (bundle != null && bundle.getString("Saludo") != null) {

            Toast.makeText(this, message_toast, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
        }
    }

    private fun sendEmail() {

        /*this method serves for send an email
            email intent
           **/
        val correos = arrayOf("paul.ayala023@gmail.com", "franccino.1313@gmail.com")

        val intentEmail = Intent(Intent.ACTION_SEND)
        intentEmail.type = "plain/text"
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, "Titulo de email")
        intentEmail.putExtra(Intent.EXTRA_TEXT, "Probando boton enviar email")
        intentEmail.putExtra(Intent.EXTRA_EMAIL, correos)
        val proveedor = Intent.createChooser(intentEmail, "Selecciona proveedor")
        startActivity(proveedor)
    }


}
