package com.example.mobilliumtask2.ikinciyol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobilliumtask2.R
import com.example.mobilliumtask2.databinding.FragmentList2Binding

class ListFragment2 : Fragment() {
    private lateinit var binding : FragmentList2Binding
    var sehir: String = ""
    var derece: String = ""
    var dereceAraligi: String = ""
    var gunesli: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

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

        binding.cardView1ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment1.text.toString()
            derece = binding.dereceTVListFragment1.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment1.text.toString()
            gunesli = binding.gunseliTVListFragment1.text.toString()

            val bundle = Bundle()
            bundle.putString("sehir",sehir)
            bundle.putString("derece",derece)
            bundle.putString("dereceAraligi",dereceAraligi)
            bundle.putString("gunesli",gunesli)
            val fragment = DetailFragment2()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fragment2,fragment)?.commit()

        }

        binding.cardView2ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment2.text.toString()
            derece = binding.dereceTVListFragment2.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment2.text.toString()
            gunesli = binding.gunseliTVListFragment2.text.toString()

            val bundle = Bundle()
            bundle.putString("sehir",sehir)
            bundle.putString("derece",derece)
            bundle.putString("dereceAraligi",dereceAraligi)
            bundle.putString("gunesli",gunesli)
            val fragment = DetailFragment2()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fragment2,fragment)?.commit()

        }

        binding.cardView3ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment3.text.toString()
            derece = binding.dereceTVListFragment3.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment3.text.toString()
            gunesli = binding.gunseliTVListFragment3.text.toString()

            val bundle = Bundle()
            bundle.putString("sehir",sehir)
            bundle.putString("derece",derece)
            bundle.putString("dereceAraligi",dereceAraligi)
            bundle.putString("gunesli",gunesli)
            val fragment = DetailFragment2()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fragment2,fragment)?.commit()

        }

        binding.cardView4ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment4.text.toString()
            derece = binding.dereceTVListFragment4.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment4.text.toString()
            gunesli = binding.gunseliTVListFragment4.text.toString()

            val bundle = Bundle()
            bundle.putString("sehir",sehir)
            bundle.putString("derece",derece)
            bundle.putString("dereceAraligi",dereceAraligi)
            bundle.putString("gunesli",gunesli)
            val fragment = DetailFragment2()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fragment2,fragment)?.commit()

        }
    }

}