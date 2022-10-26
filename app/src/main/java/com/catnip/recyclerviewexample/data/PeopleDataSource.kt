package com.catnip.recyclerviewexample.data

import com.catnip.recyclerviewexample.model.People

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

interface PeopleDataSource {
    fun getPeople(): List<People>
}

class DummyPeopleDataSource : PeopleDataSource {
    override fun getPeople(): List<People> {
        return mutableListOf(
            People("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1mC2YXQv_unxoAShM0mvlcV920U54HhE-FUKzt0BdeiWo8QjnVRGgFeO7DFHU1MdLfCs&usqp=CAU","Tony Stark","Orang kaya"),
            People("https://img.okezone.com/content/2021/08/23/320/2459641/black-widow-sumbang-pendapatan-rp1-8-triliun-ke-walt-disney-MqeMZwG0rh.jpg","Black Widdow","Beban"),
            People("https://img.okezone.com/content/2020/10/07/206/2289928/marvel-cari-aktor-untuk-perankan-bruce-banner-muda-di-she-hulk-RfE8KwAI1h.jpg","Bruce Banner","Buto ijo"),
            People("https://akcdn.detik.net.id/visual/2022/07/06/thor-dalam-thor-love-and-thunder-2_169.jpeg?w=650","Thor bin Odin","Kang malu"),
            People("https://www.suryamedia.id/wp-content/uploads/2022/07/image.jpg","Captain America","kang nyuruh nyuruh"),
        )
    }
}