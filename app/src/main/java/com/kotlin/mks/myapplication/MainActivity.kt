package com.kotlin.mks.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var rvList: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList = findViewById<RecyclerView>(R.id.rv_sample)
//        rvList =LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvList!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Mukesh", "9632587410"))
        users.add(User("Jo", "7410258963"))
        users.add(User("MK", "6464646464"))
        users.add(User("MS", "1234567990"))


        val sampleAdapter = SampleAdapter(users, { userItem: User -> partItemClicked(userItem) })


        rvList!!.adapter = sampleAdapter


    }


    private fun partItemClicked(userItem: User) {
        Toast.makeText(this, " ${userItem.name}", Toast.LENGTH_LONG).show()
    }

}
