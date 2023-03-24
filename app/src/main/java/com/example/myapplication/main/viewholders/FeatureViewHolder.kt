package com.example.myapplication.main.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.main.data.Feature
import com.example.myapplication.databinding.ItemFeatureContentBinding

class FeatureViewHolder(val binding: ItemFeatureContentBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: List<Feature>, index: Int) {
        binding.featureIcon.setImageResource(item[index].icon ?: 0)
        binding.featureContent.text = item[index].text
    }
}