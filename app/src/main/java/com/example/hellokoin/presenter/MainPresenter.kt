package com.example.hellokoin.presenter

import com.example.hellokoin.model.HelloRepository

class MainPresenter(val repo: HelloRepository) {
    fun sayHello() = repo.giveHello()
}