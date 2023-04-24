package com.example.mobilliumtask2.birinciyol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilliumtask2.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val getDerece = intent.getStringExtra("derece")
        val getSehir = intent.getStringExtra("sehir")
        val getDereceAraligi = intent.getStringExtra("dereceAraligi")
        val getGunesli = intent.getStringExtra("gunesli")
        println(getDerece + getSehir + getDereceAraligi + getGunesli)

        binding.apply {
            sehirTVDetailScreen.text = getSehir
            derece1TVDetailScreen.text = getDerece
            gunesliTVDetailScreen.text = getGunesli
            dereceAraligi1TVDetailScreen.text = getDereceAraligi
            dereceAraligi2TVDetailScreen.text = getDereceAraligi
            dereceAraligi3TVDetailScreen.text = getDereceAraligi
            dereceAraligi4TVDetailScreen.text = getDereceAraligi
        }
    }
}