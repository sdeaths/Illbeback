package com.example.illbeback.domain

interface AuthRepository {
    fun loginUseCase(): Boolean
}