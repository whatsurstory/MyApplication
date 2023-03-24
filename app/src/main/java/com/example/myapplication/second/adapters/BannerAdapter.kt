package com.example.myapplication.second.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemLayoutBannerBinding
import com.example.myapplication.second.data.Banner

class BannerAdapter(
    private val banner: Banner
) : RecyclerView.Adapter<BannerAdapter.DataViewHolder>() {

    class DataViewHolder(private val binding: ItemLayoutBannerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(banner: Banner) {
            binding.imageViewBanner.setImageResource(banner.bannerImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            ItemLayoutBannerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(banner)

}