package com.kotlin.mks.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView


class SampleKotlinActivity : AppCompatActivity() {

//    val tvName =null as TextView
//    val tvPhone = null
//    val btnClick = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        val tvName = findViewById<TextView>(R.id.textView)
        val tvPhone = findViewById<TextView>(R.id.textView2)
        val btnClick = findViewById<Button>(R.id.btn_click)

        btnClick.setOnClickListener {
            tvName.setText("Mukesh")
            tvPhone.setText("9629911027")

            val i = Intent(this, SampleTwoActivity::class.java)
            i.putExtra("name","Jo")
            i.putExtra("phone","9685741230")
            startActivity(i)
        }


    }

//    fun getName() {
//        tvName.setText("Mukesh")
//        tvPhone.setText("9629911027")
//    }


}