package com.example.myapplication.main


import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.main.data.Feature
import com.example.myapplication.main.data.Image
import com.example.myapplication.main.data.Spec
import com.example.myapplication.main.data.Title

class MainViewModel: ViewModel() {

    fun getImage(): Image {
        return Image(0, R.drawable.photo_1481349518771_20055b2a7b24)
    }

    fun getTitle(): Title {
        return  Title(1, "光這土能門亮百兩", "$123")
    }

    fun getSpec(): Spec {
        return Spec(2, "媽生三田包果會視燈爪苦裏民起。兆辛就何想只。尺四他能用婆村未葉兔結草。婆隻她牛房故大尺節早同問麼語怎。在完半成急童羽幫尾把外找抱三風几，抓它頭幸問你路尾七。\n" +
                "\n" +
                "占耳各員甲讀月，父麼唱邊、長休干。是汁反田給干畫百旦火松羽瓜遠前歌喝動化弓、刀旦多。鳥貫對話快看奶隻九教。\n" +
                "\n" +
                "飛次意加旦坡畫夕；氣都京童他占卜，眼流戶巴媽孝口乾第公到路戊高未苗，己午怪苗它兩日老吧金着田來几到裏去，麻斥路「夏綠字羽步步」。\n" +
                "\n" +
                "因以來說掃兄婆乙男古尤下隻固行晚歡裏、圓用波。坡朱又壯送少土西學看左蝶且，着立斥申母！刀支這許個冰夕古園實們；爪片同音和七還子千由、看目經福拍功海包幸帽六里占。息也校，犬花象助氣半家放因坐亭「天山飽以」意吉進。\n" +
                "\n")
    }

    fun getFeature(): List<Feature> {
        val list = mutableListOf<Feature>()
        list.add(Feature(3, R.drawable.baseline_check_circle_24, "0000000000"))
        list.add(Feature(3, R.drawable.baseline_check_circle_24, "0000000000"))
        list.add(Feature(3, R.drawable.baseline_check_circle_24, "0000000000"))
        list.add(Feature(3, R.drawable.baseline_check_circle_24, "0000000000"))
        list.add(Feature(3, R.drawable.baseline_check_circle_24, "0000000000"))
        return list
    }

}