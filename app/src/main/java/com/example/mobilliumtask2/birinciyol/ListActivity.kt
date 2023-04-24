package com.example.mobilliumtask2.birinciyol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilliumtask2.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    var derece: String = ""
    var sehir: String = ""
    var dereceAraligi: String = ""
    var gunesli: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cardView1.setOnClickListener {

            derece = binding.dereceTVListScreen1.text.toString()
            sehir = binding.sehirTVListScreen1.text.toString()
            dereceAraligi = binding.dereceAraligiTVListScreen1.text.toString()
            gunesli = binding.gunseliTVListScreen1.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            sendDataWithIntent(intent)
            startActivity(intent)
        }

        binding.cardView2.setOnClickListener {

            derece = binding.dereceTVListScreen2.text.toString()
            sehir = binding.sehirTVListScreen2.text.toString()
            dereceAraligi = binding.dereceAraligiTVListScreen2.text.toString()
            gunesli = binding.gunseliTVListScreen2.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            sendDataWithIntent(intent)
            startActivity(intent)
        }

        binding.cardView3.setOnClickListener {

            derece = binding.dereceTVListScreen3.text.toString()
            sehir = binding.sehirTVListScreen3.text.toString()
            dereceAraligi = binding.dereceAraligiTVListScreen3.text.toString()
            gunesli = binding.gunseliTVListScreen3.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            sendDataWithIntent(intent)
            startActivity(intent)
        }

        binding.cardView4.setOnClickListener {

            derece = binding.dereceTVListScreen4.text.toString()
            sehir = binding.sehirTVListScreen4.text.toString()
            dereceAraligi = binding.dereceAraligiTVListScreen4.text.toString()
            gunesli = binding.gunseliTVListScreen4.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            sendDataWithIntent(intent)
            startActivity(intent)
        }

    }

    private fun sendDataWithIntent(intent: Intent) {
        intent.apply {
            putExtra("derece", derece)
            putExtra("sehir", sehir)
            putExtra("dereceAraligi", dereceAraligi)
            putExtra("gunesli", gunesli)
        }
    }
}
