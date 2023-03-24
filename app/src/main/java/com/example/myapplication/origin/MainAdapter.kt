package com.example.myapplication.origin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MainAdapter(private val data: List<Data>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layout = when (viewType) {
            0 -> R.layout.item_image
            1 -> R.layout.item_title
            2 -> R.layout.item_content
            3 -> R.layout.item_options
            else -> throw IllegalArgumentException("Invalid view type")
        }

        val view = LayoutInflater
            .from(parent.context)
            .inflate(layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemViewType(position: Int): Int {
        return when (data[position]) {
            is Data.Image -> 0
            is Data.Title -> 1
            is Data.Content -> 2
            is Data.Option -> 3
            else -> throw IllegalArgumentException("Unknown View Type")
        }
    }
}
