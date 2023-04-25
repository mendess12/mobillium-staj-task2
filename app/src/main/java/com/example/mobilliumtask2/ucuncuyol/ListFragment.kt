package com.example.mobilliumtask2.ucuncuyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentListBinding
import com.example.mobilliumtask2.util.WeatherData

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val weatherData = WeatherData()
    val args: ListFragmentArgs by navArgs()
    var uuid: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)
        binding.apply {
            cardView1ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment1.text.toString()
                weatherData.derece = binding.dereceTVListFragment1.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment1.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment1.text.toString()
                uuid = 1
                action()
            }
            cardView2ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment2.text.toString()
                weatherData.derece = binding.dereceTVListFragment2.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment2.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment2.text.toString()
                uuid = 2
                action()
            }
            cardView3ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment3.text.toString()
                weatherData.derece = binding.dereceTVListFragment3.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment3.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment3.text.toString()
                uuid = 3
                action()
            }
            cardView4ListFragment.setOnClickListener {
                weatherData.sehir = binding.sehirTVListFragment4.text.toString()
                weatherData.derece = binding.dereceTVListFragment4.text.toString()
                weatherData.dereceAraligi = binding.dereceAraligiTVListFragment4.text.toString()
                weatherData.gunesli = binding.gunseliTVListFragment4.text.toString()
                uuid = 4
                action()
            }
        }

        // _ = request key
        setFragmentResultListener("requestKey") { _, bundle ->
            val result = bundle.getString("bundleKey")
            println("islem ici : " + args.uuidList)
            when (args.uuidList) {
                1 -> binding.dereceTVListFragment1.text = result
                2 -> binding.dereceTVListFragment2.text = result
                3 -> binding.dereceTVListFragment3.text = result
                4 -> binding.dereceTVListFragment4.text = result
            }
            true
            println(result)
        }
    }

    private fun action() {
        val action = ListFragmentDirections.actionListFragmentToDetailFragment(
            weatherData.sehir,
            weatherData.derece,
            weatherData.dereceAraligi,
            weatherData.gunesli,
            uuid
        )
        findNavController().navigate(action)
    }
}