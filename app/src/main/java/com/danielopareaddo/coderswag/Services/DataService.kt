package com.danielopareaddo.coderswag.Services

import com.danielopareaddo.coderswag.Model.Category
import com.danielopareaddo.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category ("SHIRTS", "shirtimage"),
        Category ("HOODIES", "hoodieimage"),
        Category ("HATS", "hatimage"),
        Category ("DIGITAL", "digitalgoodsimage"),
        Category ("SHIRTS", "shirtimage"),
        Category ("HOODIES", "hoodieimage"),
        Category ("HATS", "hatimage"),
        Category ("DIGITAL", "digitalgoodsimage"),
        Category ("SHIRTS", "shirtimage"),
        Category ("HOODIES", "hoodieimage"),
        Category ("HATS", "hatimage"),
        Category ("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product ("Devslopes Graphic Beanie", "$18", "hat1","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat Black", "$20", "hat2","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat White", "$18", "hat3","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat Snapback", "$22", "hat4","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Graphic Beanie", "$18", "hat1","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat Black", "$20", "hat2","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat White", "$18", "hat3","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat Snapback", "$22", "hat4","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Graphic Beanie", "$18", "hat1","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat Black", "$20", "hat2","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat White", "$18", "hat3","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform."),
        Product ("Devslopes Hat Snapback", "$22", "hat4","a shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform.")
    )

    val hoodies = listOf(

        Product ("Devslopes Grey Hoodie", "$28", "hoodie1","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Hoodie Red", "$32", "hoodie2","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Grey Hoodie", "$28", "hoodie3","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Hoodie Red", "$32", "hoodie4","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Grey Hoodie", "$28", "hoodie1","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Hoodie Red", "$32", "hoodie2","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Grey Hoodie", "$28", "hoodie3","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Hoodie Red", "$32", "hoodie4","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Grey Hoodie", "$28", "hoodie1","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Hoodie Red", "$32", "hoodie2","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Grey Hoodie", "$28", "hoodie3","a hooded sweatshirt, jacket, or other top."),
        Product ("Devslopes Hoodie Red", "$32", "hoodie4","a hooded sweatshirt, jacket, or other top.")
    )

    val shirts = listOf(
        Product ("Devslopes Grey shirt", "$18", "shirt1" ,"a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes shirt Red", "$20", "shirt2","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes Grey shirt", "$28", "shirt3","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes shirt Red", "$22", "shirt4","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes black shirt", "$32", "shirt5","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes Grey shirt", "$18", "shirt1","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes shirt Red", "$20", "shirt2","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes Grey shirt", "$28", "shirt3","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes shirt Red", "$22", "shirt4","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes black shirt", "$32", "shirt5","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes Grey shirt", "$18", "shirt1","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes shirt Red", "$20", "shirt2","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes Grey shirt", "$28", "shirt3","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes shirt Red", "$22", "shirt4","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat."),
        Product ("Devslopes black shirt", "$32", "shirt5","a short-sleeved casual top, generally made of cotton, having the shape of a T when spread out flat.")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product>{
        return when (category){

            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}