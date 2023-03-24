package com.example.myapplication.origin

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {
    fun bind(item : Data) {
        when (item) {
            is Data.Image -> bindImg(item)
            is Data.Title -> bindTitle(item)
            is Data.Content -> bindContent(item)
            is Data.Option -> bindOptions(item)
        }
    }

    private fun bindImg(item: Data.Image) {
        binding.findViewById<ImageView>(R.id.main_image).setImageResource(item.resource)
    }
    private fun bindTitle(item: Data.Title) {
        binding.findViewById<TextView>(R.id.main_title).text = item.text
        binding.findViewById<TextView>(R.id.main_price).text = item.price
    }
    private fun bindContent(item: Data.Content) {
        binding.findViewById<TextView>(R.id.main_content).text = item.text
    }
    private fun bindOptions(item: Data.Option) {
        binding.findViewById<ImageView>(R.id.main_icon).setImageResource(item.icon)
        binding.findViewById<TextView>(R.id.main_option).text = item.text
    }
}