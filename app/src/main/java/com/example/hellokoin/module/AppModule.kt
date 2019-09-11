package com.example.hellokoin.module

import com.example.hellokoin.model.HelloRepository
import com.example.hellokoin.model.HelloRepositoryImpl
import com.example.hellokoin.presenter.MainPresenter
import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // MainPresenter Factory
    factory<MainPresenter> { MainPresenter(get()) }
}