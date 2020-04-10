package com.danielopareaddo.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danielopareaddo.coderswag.Adapters.CategoryRecycleAdapter
import com.danielopareaddo.coderswag.R
import com.danielopareaddo.coderswag.Services.DataService
import com.danielopareaddo.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter                                                                //our adapter is a related to or takes it's source from the CateforyRecyclerAdapter class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->       //The adapter variable will contain values from the categories list in the DataServie file of this application
            val productIntent = Intent(this, ProductsActivity::class.java)                  //productIntent variable is an Intent which relates to the ProductActivity java class of this package/application(CoderSwag)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)                                      //the productIntent variable which relates to the ProductActivity page will push the EXTRA_CATEGORY constant our key with value category.title to the ProductActivity page.
            startActivity(productIntent)                                                               //initiate this activity using the productIntent variable
        }
            categoryListView.adapter = adapter                                                      //The categoryListView interface adapter is recycler adapter as defined above
            val layoutManager = LinearLayoutManager(this)                                  //our layoutManager variable is a LinerLayoutManager for this application
            categoryListView.layoutManager = layoutManager                                        //our categoryListView's layoutManger is a defined by the variable layoutManager
            categoryListView.setHasFixedSize(true)                                                //This is used when we're sure our cells will not change in size


    }
}
