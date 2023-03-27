package com.example.mobilliumtask2.ikinciyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentDetail2Binding

class DetailFragment2 : Fragment() {
    private lateinit var binding: FragmentDetail2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetail2Binding.bind(view)
        val args = this.arguments
        val sehir = args?.getString("sehir")
        val derece = args?.getString("derece")
        val dereceAraligi = args?.getString("dereceAraligi")
        val gunesli = args?.getString("gunesli")

        binding.sehirTVDetailFragment.text = sehir
        binding.derece1TVDetailFragment.text = derece
        binding.dereceAraligi1TVDetailFragment.text = dereceAraligi
        binding.dereceAraligi2TVDetailFragment.text = dereceAraligi
        binding.dereceAraligi3TVDetailFragment.text = dereceAraligi
        binding.dereceAraligi4TVDetailFragment.text = dereceAraligi
        binding.gunesliTVDetailFragment.text = gunesli

    }
}