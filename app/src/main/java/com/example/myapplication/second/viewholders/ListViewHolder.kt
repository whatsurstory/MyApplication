package com.example.myapplication.second.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemListBinding

class ListViewHolder(val binding:ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: List<com.example.myapplication.second.data.List>, index: Int) {
        binding.icon.setImageResource(item[index].icon)
        binding.listText.text = item[index].text
    }
}