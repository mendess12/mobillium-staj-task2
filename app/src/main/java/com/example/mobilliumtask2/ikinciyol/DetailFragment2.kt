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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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

        binding.apply {
            sehirTVDetailFragment.text = sehir
            derece1TVDetailFragment.text = derece
            dereceAraligi1TVDetailFragment.text = dereceAraligi
            dereceAraligi2TVDetailFragment.text = dereceAraligi
            dereceAraligi3TVDetailFragment.text = dereceAraligi
            dereceAraligi4TVDetailFragment.text = dereceAraligi
            gunesliTVDetailFragment.text = gunesli
        }
    }
}