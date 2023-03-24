package com.example.mobilliumtask2.ucuncuyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding
    val args : DetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)
        val sehir = args.sehir
        val derece = args.derece
        val dereceAraligi = args.dereceAraligi
        val gunesli = args.gunesli
        binding.sehirTVDetailFragment.text = sehir
        binding.derece1TVDetailFragment.text = derece
        binding.dereceAraligi1TVDetailFragment.text = dereceAraligi
        binding.dereceAraligi2TVDetailFragment.text = dereceAraligi
        binding.dereceAraligi3TVDetailFragment.text = dereceAraligi
        binding.dereceAraligi4TVDetailFragment.text = dereceAraligi
        binding.gunesliTVDetailFragment.text = gunesli
    }
}