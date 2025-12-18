package com.example.shoppingapp.common

import com.example.shoppingapp.domain.models.BannerDataModels
import com.example.shoppingapp.domain.models.CategoryDataModels
import com.example.shoppingapp.domain.models.ProductDataModels

data class HomeScreenState(
    val isLoading : Boolean = true,
    val errorMessage:String?=null,
    val categories: List<CategoryDataModels>? = null,
    val products: List<ProductDataModels>? = null,
    val banners:List<BannerDataModels>? = null,


    )