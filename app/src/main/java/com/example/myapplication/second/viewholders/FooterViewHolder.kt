package com.example.myapplication.second.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemFooterBinding
import com.example.myapplication.second.data.FootData

class FooterViewHolder(val binding: ItemFooterBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item : FootData){
        binding.footerText.text = item.text
    }
}