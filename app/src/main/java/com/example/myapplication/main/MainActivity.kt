package com.example.myapplication.main


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import com.example.myapplication.R
import com.example.myapplication.main.adapters.FeatureAdapter
import com.example.myapplication.main.adapters.ImageAdapter
import com.example.myapplication.main.adapters.SpecAdapter
import com.example.myapplication.main.adapters.TitleAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.main.data.Title
import com.example.myapplication.origin.OriginActivity
import com.example.myapplication.second.SecondActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        initView()
    }


    private fun initView() {
        val imgAdapter = ImageAdapter(
            viewModel.getImage(),
            ImageAdapter.OnClickListener {
                Toast.makeText(this, " Image Clicked",Toast.LENGTH_SHORT).show()
            }
        )
        val titleAdapter = TitleAdapter(viewModel.getTitle())
        val specAdapter = SpecAdapter(viewModel.getSpec())
        val featureAdapter = FeatureAdapter(viewModel.getFeature())

        //reuse same element
        val img= ImageAdapter(viewModel.getImage(),
            ImageAdapter.OnClickListener {
                Toast.makeText(this, " img Clicked",Toast.LENGTH_SHORT).show()
            })
        val title = TitleAdapter(viewModel.getTitle())
        val spec = SpecAdapter(viewModel.getSpec())
        val feature = FeatureAdapter(viewModel.getFeature())

        //取消共用快取
        val config = ConcatAdapter.Config.Builder().setIsolateViewTypes(false).build()

        val concatAdapter = ConcatAdapter(config ,imgAdapter, titleAdapter, specAdapter, featureAdapter,img , title ,spec , feature) //position is depends on how you assigned
        binding.recycler.adapter = concatAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        println(item.itemId)
        return when (item.itemId) {
            R.id.originadapter -> {
                val intent = Intent(this, OriginActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.multipleRecyclerView -> {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}