package com.example.mobilliumtask2.ucuncuyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentDetailBinding
import kotlin.random.Random

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()
    private var randomDerece = 0

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
        val uuidDetail = args.uuid
        println(uuidDetail)

        binding.apply {
            sehirTVDetailFragment.text = sehir
            derece1TVDetailFragment.text = derece
            dereceAraligi1TVDetailFragment.text = dereceAraligi
            dereceAraligi2TVDetailFragment.text = dereceAraligi
            dereceAraligi3TVDetailFragment.text = dereceAraligi
            dereceAraligi3TVDetailFragment.text = dereceAraligi
            gunesliTVDetailFragment.text = gunesli
        }

        binding.refresIvDetailFragment.setOnClickListener {
            randomDerece = Random.nextInt(14, 27)
            println(randomDerece)
            binding.derece1TVDetailFragment.text = randomDerece.toString()
        }

        binding.verileriGuncelleFragment.setOnClickListener {
            val result = randomDerece.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
            val action = DetailFragmentDirections.actionDetailFragmentToListFragment(uuidDetail)
            findNavController().navigate(action)
        }
    }
}