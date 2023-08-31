package com.example.prueba1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.prueba1.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding
     lateinit var viewModel: ComparadorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(ComparadorViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}


