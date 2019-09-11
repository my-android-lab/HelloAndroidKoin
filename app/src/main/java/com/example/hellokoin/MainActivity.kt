package com.example.hellokoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellokoin.presenter.MainPresenter
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val presenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
