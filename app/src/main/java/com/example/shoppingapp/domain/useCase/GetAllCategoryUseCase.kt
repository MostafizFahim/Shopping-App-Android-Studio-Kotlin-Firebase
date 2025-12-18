package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.CategoryDataModels
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllCategoryUseCase @Inject constructor(private val repo: Repo) {
    fun getAllCategoryUseCase(): Flow<ResultState<List<CategoryDataModels>>>{
        return repo.getAllCategories()
    }
}