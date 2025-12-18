package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.ProductDataModels
import com.example.shoppingapp.domain.models.UserDataParent
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UpDateUserDataUseCase @Inject constructor(private val repo: Repo) {
    fun upDateUserData(userDataParent: UserDataParent): Flow<ResultState<String>>{
        return repo.upDateUserData(userDataParent)

    }
}