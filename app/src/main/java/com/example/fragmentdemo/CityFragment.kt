package com.example.fragmentdemo

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.databinding.FragmentCityBinding


class CityFragment : Fragment() {

    lateinit var binding: FragmentCityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCityBinding.inflate(inflater, container, false)


        var city = if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
            activity?.intent?.getStringExtra("city")
        else
            arguments?.getString("city")

        binding.tvCity.text = "Die gewählte Stadt ist $city"

        binding.btnWeb.setOnClickListener {
            // Aufruf der Website durch impliziten Intent. Kein direktes Ziel
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.$city.de")
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return binding.root
    }


}