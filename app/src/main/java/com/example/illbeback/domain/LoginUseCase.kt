package com.example.illbeback.domain

class LoginUseCase(private val authRepository: AuthRepository) {
    fun loginUseCase(): Boolean{
        return authRepository.loginUseCase()
    }
}