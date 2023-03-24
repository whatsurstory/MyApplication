package com.example.myapplication.second.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemFooterBinding
import com.example.myapplication.second.data.FootData
import com.example.myapplication.second.viewholders.FooterViewHolder

class FooterAdapter(val data: FootData): RecyclerView.Adapter<FooterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FooterViewHolder {
        return FooterViewHolder(ItemFooterBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: FooterViewHolder, position: Int) {
        holder.bind(data)
    }

//    override fun getItemViewType(position: Int): Int {
//        return R.layout.item_footer
//    }

}