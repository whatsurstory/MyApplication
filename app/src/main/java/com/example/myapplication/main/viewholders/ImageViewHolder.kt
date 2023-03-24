package com.example.myapplication.main.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.main.data.Image
import com.example.myapplication.databinding.ItemMainImageBinding

class ImageViewHolder(val binding: ItemMainImageBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Image) {
        binding.mainImage.setImageResource(item.resource ?: 0)
    }
}