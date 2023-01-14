package com.example.zadacha1401.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zadacha1401.R
import com.example.zadacha1401.model.Recents

class RecentsAdapter(val list:ArrayList<Recents>):RecyclerView.Adapter<RecentsAdapter.RecentsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentsViewHolder {
        return RecentsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recents,parent,false))
    }

    override fun onBindViewHolder(holder: RecentsViewHolder, position: Int) {
        val recents=list[position]
        holder.apply {
            Glide.with(ivRasm).load(recents.rasm).into(ivRasm)
            tvName.text=recents.name
            tvTime.text=recents.time
        }
    }

    override fun getItemCount() = list.size
    class RecentsViewHolder(view: View):RecyclerView.ViewHolder(view){
        val ivRasm=view.findViewById<ImageView>(R.id.iv_rasm)
        val tvName=view.findViewById<TextView>(R.id.tv_name)
        val tvTime=view.findViewById<TextView>(R.id.tv_time)
    }
}