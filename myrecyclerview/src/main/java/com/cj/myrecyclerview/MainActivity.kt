package com.cj.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cj.myrecyclerview.adapter.MyAdapter
import com.cj.myrecyclerview.model.Fruit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private val fruitList = ArrayList<Fruit>()
    //val adapter : MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        val layoutManager = LinearLayoutManager(this)
        rv.layoutManager = layoutManager
        val adapter = MyAdapter(fruitList)
        rv.adapter = adapter
    }

    private fun initFruits() {
        repeat(2){
            fruitList.add(Fruit("apple",R.drawable.apple_pic))
            fruitList.add(Fruit("banana",R.drawable.banana_pic))
            fruitList.add(Fruit("watermelon",R.drawable.watermelon_pic))
            fruitList.add(Fruit("pear",R.drawable.pear_pic))
            fruitList.add(Fruit("grape",R.drawable.grape_pic))
            fruitList.add(Fruit("pineapple",R.drawable.pineapple_pic))
            fruitList.add(Fruit("strawberry",R.drawable.strawberry_pic))
            fruitList.add(Fruit("cherry",R.drawable.cherry_pic))
            fruitList.add(Fruit("mango",R.drawable.mango_pic))
        }
    }
}
