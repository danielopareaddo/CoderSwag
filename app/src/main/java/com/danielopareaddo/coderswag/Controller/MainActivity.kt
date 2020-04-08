package com.danielopareaddo.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielopareaddo.coderswag.Adapters.CategoryAdapter
import com.danielopareaddo.coderswag.R
import com.danielopareaddo.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.category)
        categoryListView.adapter = adapter

    }
}
