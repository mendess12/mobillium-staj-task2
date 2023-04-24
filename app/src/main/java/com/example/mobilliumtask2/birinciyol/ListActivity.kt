package com.example.mobilliumtask2.birinciyol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilliumtask2.databinding.ActivityListBinding
import com.example.mobilliumtask2.util.WeatherData

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    private val weatherData = WeatherData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            cardView1.setOnClickListener {
                weatherData.derece = binding.dereceTVListScreen1.text.toString()
                weatherData.sehir = binding.sehirTVListScreen1.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListScreen1.text.toString()
                weatherData.gunesli = binding.gunseliTVListScreen1.text.toString()

                sendDataWithIntent()
            }
            cardView2.setOnClickListener {
                weatherData.derece = binding.dereceTVListScreen2.text.toString()
                weatherData.sehir = binding.sehirTVListScreen2.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListScreen2.text.toString()
                weatherData.gunesli = binding.gunseliTVListScreen2.text.toString()

                sendDataWithIntent()
            }
            cardView3.setOnClickListener {
                weatherData.derece = binding.dereceTVListScreen3.text.toString()
                weatherData.sehir = binding.sehirTVListScreen3.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListScreen3.text.toString()
                weatherData.gunesli = binding.gunseliTVListScreen3.text.toString()

                sendDataWithIntent()
            }
            cardView4.setOnClickListener {
                weatherData.derece = binding.dereceTVListScreen4.text.toString()
                weatherData.sehir = binding.sehirTVListScreen4.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListScreen4.text.toString()
                weatherData.gunesli = binding.gunseliTVListScreen4.text.toString()

                sendDataWithIntent()
            }
        }
    }

    private fun sendDataWithIntent() {
        val intent = Intent(this, DetailActivity::class.java)
        intent.apply {
            putExtra("derece", weatherData.derece)
            putExtra("sehir", weatherData.sehir)
            putExtra("dereceAraligi", weatherData.dereceAraligi)
            putExtra("gunesli", weatherData.gunesli)
        }
        startActivity(intent)
    }
}
