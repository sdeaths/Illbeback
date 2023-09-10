package com.example.illbeback.data

import com.example.illbeback.domain.AuthRepository

class AuthRepositoryImpl: AuthRepository {
    override fun loginUseCase(): Boolean {
        return true
    }
}