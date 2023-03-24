package com.example.myapplication.origin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.OriginActivityBinding

class OriginActivity : AppCompatActivity() {

    lateinit var binding: OriginActivityBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OriginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = MainAdapter(viewModel.getData())
        binding.mainRecycle.adapter = adapter
    }
}