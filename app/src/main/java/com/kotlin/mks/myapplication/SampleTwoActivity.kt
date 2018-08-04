package com.kotlin.mks.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sample.*

class SampleTwoActivity : AppCompatActivity() {


    private var tvName: TextView? = null
    private var tvPhone: TextView? = null
    private var profileName:String?=null
    private var profilePhone:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        tvName = findViewById<TextView>(R.id.textView)
        tvPhone = findViewById<TextView>(R.id.textView2)
        val btnClick = findViewById<Button>(R.id.btn_click)


        if (intent.extras != null) {
             profileName = intent.getStringExtra("name")
             profilePhone = intent.getStringExtra("phone")
            tvName!!.setText(profileName)
            tvPhone!!.setText(profilePhone)
        }




        btnClick.setOnClickListener {
            getName()
        }


    }



    fun getName() {
        if (!tvName!!.text.toString().equals("Mukesh")) {

            tvName!!.setText("Mukesh")
            tvPhone!!.setText("9629911027")
        } else {
            Toast.makeText(this, "Alreasy", Toast.LENGTH_SHORT).show()
        }
    }
}