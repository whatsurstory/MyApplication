package com.example.myapplication.main.viewholders

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.main.data.Spec
import com.example.myapplication.databinding.ItemSpecContentBinding

class SpecViewHolder(val binding: ItemSpecContentBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Spec) {
        binding.specContent.text = item.text
    }
}