 package com.danielopareaddo.coderswag.Controller


 import android.content.Intent
 import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.danielopareaddo.coderswag.Adapters.ProductsAdapter
import com.danielopareaddo.coderswag.R
import com.danielopareaddo.coderswag.Services.DataService
import com.danielopareaddo.coderswag.Utilities.EXTRA_CATEGORY
 import com.danielopareaddo.coderswag.Utilities.EXTRA_PRODUCT
 import kotlinx.android.synthetic.main.activity_products.*

 class ProductsActivity : AppCompatActivity() {

     lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)){product ->
            val productDetailIntent = Intent (this, ProductDetailActivity :: class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product) //This is pushing the image, description, title, and price and sending it to the ProductDetailActivity
            startActivity(productDetailIntent)
        }


        var spanCount = 2
        val orientation = resources.configuration.orientation

        if (orientation == ORIENTATION_LANDSCAPE){   // You can also use == Configuration.ORIENTATION_LANDSCAPE ....And dont forget to import
            spanCount = 4
        }


        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 4
        }

        if((screenSize > 720)&&(orientation == ORIENTATION_LANDSCAPE)){
            spanCount = 6
        }


        val layoutManager = GridLayoutManager (this, spanCount) // This will create columns according to the span(column) number in a grid view
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
