package com.danielopareaddo.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danielopareaddo.coderswag.Adapters.CategoryAdapter
import com.danielopareaddo.coderswag.Adapters.CategoryRecycleAdapter
import com.danielopareaddo.coderswag.R
import com.danielopareaddo.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.category)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true) //This is used when we're sure our cells will not change in size

    }
}
