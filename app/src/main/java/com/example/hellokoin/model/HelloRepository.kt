package com.example.hellokoin.model

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl(): HelloRepository {
    override fun giveHello(): String {
        return "Hello Koin"
    }
}