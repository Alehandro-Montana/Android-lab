package com.example.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var itemList: generateItemList()
    private lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        adapter = MyAdapter(itemList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
    private fun generateItemList(): List<Item> {
        //
        val itemList = mutableListof<Item>()
        //
        itemList.add(Item("Dodge", "https://cdn.jdpower.com/JDP_2023%20Dodge%20Charger%20RT%20Scat%20Pack%20Widebody%20Front%20Quarter%20View.jpg"))
        itemList.add(Item("AN-225 Mriya", "https://images.flyingmag.com/flyingma/wp-content/uploads/2022/04/14160126/shutterstock_1065944747-1-1-scaled.jpg"))
        itemList.add(Item("Sea", "https://img.freepik.com/free-photo/beautiful-tropical-beach-sea-ocean-with-white-cloud-blue-sky-copyspace_74190-8663.jpg?w=360"))

        return data
    }



}