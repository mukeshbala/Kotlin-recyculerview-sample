package com.kotlin.mks.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var rvList: RecyclerView? = null

    val nameEX = arrayOf("Shakespeare", "Hemingway", "Twain")

    val phoneEx = arrayOf("789596464646", "544646546", "36985201478")
//    var phoneNumber = setOf(1, 10, 15)


    val users = ArrayList<User>()
    val userSample = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList = findViewById<RecyclerView>(R.id.rv_sample)
//        rvList =LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvList!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


//        for(nameS in (nameEX)){
//            userSample.add(User(user))
//        }

        for (i in nameEX.indices
        ) {
            users.add(User(nameEX[i], phoneEx[i]))
        }

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
