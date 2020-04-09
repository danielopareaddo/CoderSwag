package com.danielopareaddo.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danielopareaddo.coderswag.Model.Category
import com.danielopareaddo.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick:(Category)-> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
//val itemClick:(Category)-> Unit ... this is what will enable us be able to click on the items in the recycler view, its a lambda expression thats a function that also behaves as a type, can be returned and saved into a variable or property(a 1st class citizen), it can be passed around in code

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)

    }

    override fun getItemCount(): Int { // tells the recycle view how many items it will be displaying

        return categories.count()

    }

    override fun onBindViewHolder(holder: Holder, position: Int) { //This is the function that is called by the recycler view to display the data at a specified location. Binding is the process of calling a child view to display data according to a position within the adapter

        holder.bindCategory(categories[position], context)

    }

    inner class Holder (itemView:View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView!!){  // The holder is also responsible for the binding

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory (category: Category, context: Context){

            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
            itemView.setOnClickListener { itemClick(category) }

        }
    }
}