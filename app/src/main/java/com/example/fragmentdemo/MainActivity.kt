package com.example.fragmentdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)

// ein weiterer Weg mit with-Block
//        with(binding){
//            btn1.setOnClickListener(this@MainActivity)
//            btn2.setOnClickListener(this@MainActivity)
//            btn3.setOnClickListener(this@MainActivity)
//        }

    }

    override fun onClick(view: View?) {
       if(view is Button){
           val city = view.text

           // Aufruf der CityActivity mit Namen der Stadt durch expliziten Intent
           val intent = Intent(this, CityActivity::class.java)
           intent.putExtra("city", city)
           startActivity(intent)
       }
    }
}











