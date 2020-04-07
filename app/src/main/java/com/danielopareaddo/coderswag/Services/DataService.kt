package com.danielopareaddo.coderswag.Services

import com.danielopareaddo.coderswag.Model.Category
import com.danielopareaddo.coderswag.Model.Product

object DataService {

    val category = listOf(
        Category ("SHIRTS", "shirtimage"),
        Category ("HOODIES", "hoodiesimage"),
        Category ("HATS", "hatimage"),
        Category ("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product ("Devslopes Graphic Beanie", "$18", "hat1"),
        Product ("Devslopes Hat Black", "$20", "hat2"),
        Product ("Devslopes Hat White", "$18", "hat3"),
        Product ("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodie = listOf(

        Product ("Devslopes Grey Hoodie", "$28", "hoodie1"),
        Product ("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product ("Devslopes Grey Hoodie", "$28", "hoodie3"),
        Product ("Devslopes Hoodie Red", "$32", "hoodie4")
    )

    val shirt = listOf(
        Product ("Devslopes Grey shirt", "$18", "shirt1"),
        Product ("Devslopes shirt Red", "$20", "shirt2"),
        Product ("Devslopes Grey shirt", "$28", "shirt3"),
        Product ("Devslopes shirt Red", "$22", "shirt4"),
        Product ("Devslopes black shirt", "$32", "shirt5")
    )
}