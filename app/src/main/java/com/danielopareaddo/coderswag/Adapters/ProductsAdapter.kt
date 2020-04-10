package com.danielopareaddo.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danielopareaddo.coderswag.Model.Product
import com.danielopareaddo.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*
import kotlin.coroutines.coroutineContext

class ProductsAdapter(val contex:Context, val products: List<Product>): RecyclerView.Adapter <ProductsAdapter.ProductHolder>(){


    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct (product: Product, contex: Context){

            val resourceId = contex.resources.getIdentifier(product.image, "drawable", contex.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {

        val view = LayoutInflater.from(contex).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)

    }

    override fun getItemCount(): Int {

        return products.count()

    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {

        holder?.bindProduct(products[position], contex)
    }
}