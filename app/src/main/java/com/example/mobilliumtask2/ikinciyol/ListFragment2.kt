package com.example.mobilliumtask2.ikinciyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentList2Binding
import com.example.mobilliumtask2.util.WeatherData

class ListFragment2 : Fragment() {
    private lateinit var binding: FragmentList2Binding
    private val weatherData = WeatherData()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentList2Binding.bind(view)
        binding.apply {
            cardView1ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment1.text.toString()
                weatherData.derece = binding.dereceTVListFragment1.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment1.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment1.text.toString()
                sendDataWithBundle()
            }
            cardView2ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment2.text.toString()
                weatherData.derece = binding.dereceTVListFragment2.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment2.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment2.text.toString()
                sendDataWithBundle()
            }
            cardView3ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment3.text.toString()
                weatherData.derece = binding.dereceTVListFragment3.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment3.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment3.text.toString()
                sendDataWithBundle()
            }
            cardView4ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment4.text.toString()
                weatherData.derece = binding.dereceTVListFragment4.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment4.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment4.text.toString()
                sendDataWithBundle()
            }
        }
    }

    private fun sendDataWithBundle() {
        val bundle = Bundle()
        bundle.apply {
            putString("sehir", weatherData.sehir)
            putString("derece", weatherData.derece)
            putString("dereceAraligi", weatherData.dereceAraligi)
            putString("gunesli", weatherData.gunesli)
        }
        val fragment = DetailFragment2()
        fragment.arguments = bundle
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.fragment2, fragment)
            addToBackStack(null)
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            commit()
        }
    }
}