package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.domain.models.BannerDataModels

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.di.models.ProductDataModels
import com.example.shoppingapp.domain.models.CategoryDataModels
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBannerUseCase @Inject constructor(private val repo: Repo) {
    fun getBannerUseCase(): Flow<ResultState<List<BannerDataModels>>>{
        return repo.getBanner()

    }
}