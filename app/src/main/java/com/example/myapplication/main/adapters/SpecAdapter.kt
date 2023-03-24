package com.example.myapplication.main.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.main.data.Spec
import com.example.myapplication.databinding.ItemSpecContentBinding
import com.example.myapplication.main.viewholders.SpecViewHolder

class SpecAdapter(val list: Spec): RecyclerView.Adapter<SpecViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecViewHolder {
        return SpecViewHolder(ItemSpecContentBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: SpecViewHolder, position: Int) {
        holder.bind(list)
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_spec_content
    }
}