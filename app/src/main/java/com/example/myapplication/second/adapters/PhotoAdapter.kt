package com.example.myapplication.second.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemHeaderBinding
import com.example.myapplication.second.data.HeaderImage

class PhotoAdapter(val img: List<HeaderImage>) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: List<HeaderImage>, index: Int) {
            binding.headerImage.setImageResource(item[index].photo)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemHeaderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return img.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(img , position)
    }
}