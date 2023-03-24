package com.example.myapplication.main.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.main.data.Title
import com.example.myapplication.databinding.ItemMainTitleBinding
import com.example.myapplication.main.viewholders.TitleViewHolder


class TitleAdapter(val list: Title) : RecyclerView.Adapter<TitleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        return TitleViewHolder(
            ItemMainTitleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: TitleViewHolder, position: Int) {
        holder.bind(list)
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_main_title
    }
}