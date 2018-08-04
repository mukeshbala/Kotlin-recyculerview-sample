package com.kotlin.mks.myapplication

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SampleAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {
    //class SampleAdapter() : RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {
//    val  userList:ArrayList<User>?=null;
//    fun SampleAdapter( userList: ArrayList<User>){
//
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleAdapter.SampleViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sample, parent, false)
        return SampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: SampleAdapter.SampleViewHolder, position: Int) {
        holder.bindItems(userList[position])

    }

    class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User) {
            val tvName = itemView.findViewById<TextView>(R.id.tv_name_sample)
            val tvPhone = itemView.findViewById<TextView>(R.id.tv_phone_sample)

            tvName.text = user.name
            tvPhone.text = user.phone
        }

    }

}