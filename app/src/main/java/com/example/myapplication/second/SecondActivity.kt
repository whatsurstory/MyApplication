package com.example.myapplication.second

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySecondBinding
import com.example.myapplication.second.SecondViewModel
import com.example.myapplication.second.adapters.BannerAdapter
import com.example.myapplication.second.adapters.FooterAdapter
import com.example.myapplication.second.adapters.HeaderAdapter
import com.example.myapplication.second.adapters.ListAdapter
import com.example.myapplication.second.data.FootData

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    val vm : SecondViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val headerAdapter = HeaderAdapter(vm.getHeader())
        val listAdapter = ListAdapter(vm.getList())
        val footerAdapter = FooterAdapter(vm.getFooter())
        val concat = ConcatAdapter(headerAdapter, listAdapter, footerAdapter)
//        concat.addAdapter(BannerAdapter(vm.getBanner())) //在最後
//        concat.addAdapter(0,BannerAdapter(vm.getBanner())) //指定位置
        binding.secondRecycler.adapter = concat
    }

}
