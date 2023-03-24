package com.example.myapplication.second.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.SecondActivityHeaderBinding
import com.example.myapplication.second.data.Header
import com.example.myapplication.second.viewholders.HeaderViewHolder

class HeaderAdapter(val data: Header): RecyclerView.Adapter<HeaderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        return HeaderViewHolder(SecondActivityHeaderBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bind(data, position)
    }

//    override fun getItemViewType(position: Int): Int {
//        return R.layout.second_activity_header
//    }

}