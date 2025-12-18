package com.example.shoppingapp.domain.repo

import android.net.Uri
import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.BannerDataModels
import com.example.shoppingapp.domain.models.CartDataModels
import com.example.shoppingapp.domain.models.CategoryDataModels
import com.example.shoppingapp.domain.models.ProductDataModels
import com.example.shoppingapp.domain.models.UserData
import com.example.shoppingapp.domain.models.UserDataParent
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun registerUserWithEmailAndPassword(userData : UserData) : Flow<ResultState<String>>
    fun loginUserWithEmailAndPassword(userData : UserData) : Flow<ResultState<String>>
    fun getUserById(uid: String):Flow<ResultState<UserDataParent>>
    fun upDateUserData(userDataParent: UserDataParent):Flow<ResultState<String>>
    fun userProfileImage(uri: Uri):Flow<ResultState<String>>
    fun getCategoriesInLimited():Flow<ResultState<List<CategoryDataModels>>>
    fun getProductsInLimited():Flow<ResultState<List<ProductDataModels>>>
    fun gerAllProducts():Flow<ResultState<List<ProductDataModels>>>
    fun getProductById(productId : String): Flow<ResultState<ProductDataModels>>
    fun addToCart(cartDataModels: CartDataModels): Flow<ResultState<String>>
    fun addToFav(productDataModels: ProductDataModels) : Flow<ResultState<String>>
    fun getAllFav():Flow<ResultState<List<ProductDataModels>>>
    fun getCart():Flow<ResultState<List<CartDataModels>>>
    fun getAllCategories(): Flow<ResultState<List<CategoryDataModels>>>
    fun getCheckout(productId:String):Flow<ResultState<ProductDataModels>>
    fun getBanner():Flow<ResultState<List<BannerDataModels>>>
    fun getSpecificCategoryItem(categoryName:String):Flow<ResultState<List<ProductDataModels>>>
    fun getAllSuggestedProducts():Flow<ResultState<List<ProductDataModels>>>
}