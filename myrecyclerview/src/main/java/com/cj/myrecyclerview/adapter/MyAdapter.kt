package com.cj.myrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cj.myrecyclerview.R
import com.cj.myrecyclerview.model.Fruit

class MyAdapter(private val list:List<Fruit>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = list[position]
        holder.iconIv.setImageResource(fruit.iconId)
        holder.title.text = fruit.title
    }

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val title:TextView  = view.findViewById(R.id.title)
        val iconIv:ImageView = view.findViewById(R.id.icon)
    }
}