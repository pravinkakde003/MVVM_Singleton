package com.user.myapplicationmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.user.observe(this, Observer {
            println("DEBUG: $it")
        })

        viewModel.setUserId("cat")

    }


    override fun onDestroy() {
        super.onDestroy()
        viewModel.cancelJobs()
    }
}