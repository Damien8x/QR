package com.varvet.barcodereadersample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ViewStatistics : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_statistics)


        findViewById<Button>(R.id.export_button).setOnClickListener {
            val text = "exporting to device"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        findViewById<Button>(R.id.back_button).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.manage_keys_button).setOnClickListener {
            val intent = Intent(this, ManageKeys::class.java)
            startActivity(intent)
        }



    }
}
