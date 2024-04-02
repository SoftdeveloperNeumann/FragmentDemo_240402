package com.example.fragmentdemo

import android.content.Intent
import android.net.Uri
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

        val city = intent.getStringExtra("city")
        binding.tvCity.text = "Die gewählte Stadt ist $city"

        binding.btnWeb.setOnClickListener {
            // Aufruf der Website durch impliziten Intent. Kein direktes Ziel
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.$city.de")
            startActivity(intent)
        }

    }
}