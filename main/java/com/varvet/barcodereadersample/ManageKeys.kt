package com.varvet.barcodereadersample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ManageKeys : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_keys)


        findViewById<Button>(R.id.Import_key_button).setOnClickListener {
            val text = "KEY HAS BEEN IMPORTED"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        findViewById<Button>(R.id.export_key_button).setOnClickListener {
            val text = "KEY HAS BEEN EXPORTED"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        }


        findViewById<Button>(R.id.Finished_Button).setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}
