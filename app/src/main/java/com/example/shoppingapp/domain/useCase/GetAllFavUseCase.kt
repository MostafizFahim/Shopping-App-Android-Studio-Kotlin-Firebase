package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.CategoryDataModels
import com.example.shoppingapp.domain.models.ProductDataModels
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllFavUseCase @Inject constructor(private val repo: Repo) {
    fun getAllFav(): Flow<ResultState<List<ProductDataModels>>>{
        return repo.getAllFav()

    }
}