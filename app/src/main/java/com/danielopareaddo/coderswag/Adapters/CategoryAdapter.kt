package com.danielopareaddo.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.danielopareaddo.coderswag.Model.Category
import com.danielopareaddo.coderswag.R

class CategoryAdapter (val context: Context, val categories: List<Category>) : BaseAdapter(){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        val holder: ViewHolder

        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categroyName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder  //The unique value to the category view is the holder which is the ViewHolder class

        }else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView

        }


        val category = categories [position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName ) // This will help us get and use the name of the image files
        holder.categoryImage?.setImageResource(resourceId)
        holder.categroyName?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categroyName: TextView? = null
    }

}