package com.example.fragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentdemo.databinding.ActivityCityBinding

class CityActivity : AppCompatActivity() {

    lateinit var binding: ActivityCityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityCityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
}