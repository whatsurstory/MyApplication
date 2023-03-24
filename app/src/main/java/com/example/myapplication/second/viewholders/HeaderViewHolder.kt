package com.example.myapplication.second.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.SecondActivityHeaderBinding
import com.example.myapplication.second.adapters.PhotoAdapter
import com.example.myapplication.second.data.Header

class HeaderViewHolder(val binding: SecondActivityHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item : Header, index: Int) {
        binding.title.text = item.title
        val photoAdapter = PhotoAdapter(item.items)
        binding.horizontalRecycler.adapter = photoAdapter
    }
}