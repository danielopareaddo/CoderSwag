package com.danielopareaddo.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielopareaddo.coderswag.Model.Product
import com.danielopareaddo.coderswag.R
import com.danielopareaddo.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT) //the product variable here is receiving the intent parcel(image, description, price, title)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName) //this variable is used to locate and identify the image resources so we can set it to the imageId

        detailImageView.setImageResource(resourceId)
        detailProductName.text = product.title
        detailProductPrice.text = product.price
        detailProductDescription.text = product.details


    }
}
