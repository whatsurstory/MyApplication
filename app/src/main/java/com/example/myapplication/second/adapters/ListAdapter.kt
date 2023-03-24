package com.example.myapplication.second.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemListBinding
import com.example.myapplication.second.viewholders.ListViewHolder

class ListAdapter(val dataList: List<com.example.myapplication.second.data.List>): RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(dataList , position)
    }

//    override fun getItemViewType(position: Int): Int {
//        return R.layout.item_list
//    }
}