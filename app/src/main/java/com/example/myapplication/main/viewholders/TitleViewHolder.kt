package com.example.myapplication.main.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.main.data.Title
import com.example.myapplication.databinding.ItemMainTitleBinding

class TitleViewHolder(val binding: ItemMainTitleBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Title) {
        binding.productTitle.text = item.text
        binding.productPrice.text = item.price
    }
}