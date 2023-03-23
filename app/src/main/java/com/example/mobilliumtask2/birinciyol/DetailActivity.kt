package com.example.mobilliumtask2.birinciyol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilliumtask2.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        var getDerece = intent.getStringExtra("derece")
        var getSehir = intent.getStringExtra("sehir")
        var getDereceAraligi = intent.getStringExtra("dereceAraligi")
        var getGunesli = intent.getStringExtra("gunesli")
        println(getDerece + getSehir + getDereceAraligi + getGunesli)

        binding.sehirTVDetailScreen.text = getSehir
        binding.derece1TVDetailScreen.text = getDerece
        binding.gunesliTVDetailScreen.text = getGunesli
        binding.dereceAraligi1TVDetailScreen.text = getDereceAraligi
        binding.dereceAraligi2TVDetailScreen.text = getDereceAraligi
        binding.dereceAraligi3TVDetailScreen.text = getDereceAraligi
        binding.dereceAraligi4TVDetailScreen.text = getDereceAraligi

    }
}