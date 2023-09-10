package com.example.illbeback.presentation

import androidx.lifecycle.ViewModel
import com.example.illbeback.data.AuthRepositoryImpl
import com.example.illbeback.domain.LoginUseCase

class LoginViewModel: ViewModel() {
    private val repository = AuthRepositoryImpl()
    private val loginUseCase = LoginUseCase(repository)
    fun login(): Boolean {
        return loginUseCase.loginUseCase()
    }
}