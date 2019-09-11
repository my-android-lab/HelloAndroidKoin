package com.example.hellokoin

import com.example.hellokoin.module.appModule
import com.example.hellokoin.presenter.MainPresenter
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject

class MainPresenterTest: KoinTest {

    private val presenter: MainPresenter by inject()

    @Before
    fun before() {
        startKoin {
            modules(appModule)
        }
    }

    @Test
    fun testSayHello() {
        assert(presenter.sayHello() == "Hello Koin")
    }
}