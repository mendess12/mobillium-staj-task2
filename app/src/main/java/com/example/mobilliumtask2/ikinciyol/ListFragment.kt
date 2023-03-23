package com.example.mobilliumtask2.ikinciyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var  binding : FragmentListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

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

        binding.cardView1ListFragment.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment()
            findNavController().navigate(action)
        }

        binding.cardView2ListFragment.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment()
            findNavController().navigate(action)
        }

        binding.cardView3ListFragment.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment()
            findNavController().navigate(action)
        }

        binding.cardView4ListFragment.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment()
            findNavController().navigate(action)
        }

    }
}