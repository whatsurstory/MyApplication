package com.example.myapplication.main.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.main.data.Feature
import com.example.myapplication.databinding.ItemFeatureContentBinding
import com.example.myapplication.main.viewholders.FeatureViewHolder

class FeatureAdapter(val list: List<Feature>) : RecyclerView.Adapter<FeatureViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureViewHolder {
        return FeatureViewHolder(
            ItemFeatureContentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FeatureViewHolder, position: Int) {
        holder.bind(list, position)
        holder.itemView.setOnClickListener {
            Toast.makeText(it.context, "position $position", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_feature_content
    }
}