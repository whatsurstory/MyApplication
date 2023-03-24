package com.example.myapplication.main.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.main.data.Image
import com.example.myapplication.databinding.ItemMainImageBinding
import com.example.myapplication.main.viewholders.ImageViewHolder

class ImageAdapter(val list: Image, private val onClickListener: OnClickListener): RecyclerView.Adapter<ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(ItemMainImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return 1 //如果數字自定義大於 這邊會將一模一樣的值重複 如果要不一樣的值但是同個物件要把list type change to List<Image> 然後塞 list.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            onClickListener.onClick(list)
        }
        holder.bind(list)
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_main_image //共用快取要在 Adapter 內需要實作 getItemViewType 方法
    }

    class OnClickListener(val clickListener: (property: Image) -> Unit) {
        fun onClick(property: Image) = clickListener(property)
    }

}