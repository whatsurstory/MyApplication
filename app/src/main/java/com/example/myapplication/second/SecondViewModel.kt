package com.example.myapplication.second

import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.second.data.Banner
import com.example.myapplication.second.data.FootData
import com.example.myapplication.second.data.Header
import com.example.myapplication.second.data.HeaderImage

class SecondViewModel: ViewModel() {

    fun getHeader(): Header {
        val images = mutableListOf<HeaderImage>()
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        images.add(HeaderImage(R.drawable.photo_1481349518771_20055b2a7b24))
        return Header(0,"New Title", images)
    }

    fun getList(): List<com.example.myapplication.second.data.List> {
        val list = mutableListOf<com.example.myapplication.second.data.List>()
        list.add(com.example.myapplication.second.data.List(1,
            R.drawable.baseline_check_circle_24, "wwwwwwwwww"))
        list.add(com.example.myapplication.second.data.List(1,
            R.drawable.baseline_check_circle_24, "wwwwwwwwww"))
        list.add(com.example.myapplication.second.data.List(1,
            R.drawable.baseline_check_circle_24, "wwwwwwwwww"))
        list.add(com.example.myapplication.second.data.List(1,
            R.drawable.baseline_check_circle_24, "wwwwwwwwww"))
        list.add(com.example.myapplication.second.data.List(2,
            R.drawable.baseline_check_circle_24, "yyyyyyyyyy"))
        list.add(com.example.myapplication.second.data.List(2,
            R.drawable.baseline_check_circle_24, "yyyyyyyyyy"))
        list.add(com.example.myapplication.second.data.List(2,
            R.drawable.baseline_check_circle_24, "yyyyyyyyyy"))
        list.add(com.example.myapplication.second.data.List(2,
            R.drawable.baseline_check_circle_24, "yyyyyyyyyy"))
        list.add(com.example.myapplication.second.data.List(3,
            R.drawable.baseline_check_circle_24, "zzzzzzzzzz"))
        list.add(com.example.myapplication.second.data.List(3,
            R.drawable.baseline_check_circle_24, "zzzzzzzzzz"))
        list.add(com.example.myapplication.second.data.List(3,
            R.drawable.baseline_check_circle_24, "zzzzzzzzzz"))
        list.add(com.example.myapplication.second.data.List(3,
            R.drawable.baseline_check_circle_24, "zzzzzzzzzz"))
        return list
    }

    fun getFooter(): FootData {
        return FootData(2, "the end of world")
    }

    fun getBanner(): Banner {
        return Banner(R.drawable.photo_1481349518771_20055b2a7b24)
    }

}
