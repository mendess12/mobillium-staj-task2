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

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    val args : ListFragmentArgs by navArgs()
    var sehir: String = ""
    var derece: String = ""
    var dereceAraligi: String = ""
    var gunesli: String = ""
    var uuid : Int = 1
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
            sehir = binding.sehirTVListFragment1.text.toString()
            derece = binding.dereceTVListFragment1.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment1.text.toString()
            gunesli = binding.gunseliTVListFragment1.text.toString()
            uuid = 1
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(sehir,derece,dereceAraligi,gunesli,uuid)
            findNavController().navigate(action)
        }

        binding.cardView2ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment2.text.toString()
            derece = binding.dereceTVListFragment2.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment2.text.toString()
            gunesli = binding.gunseliTVListFragment2.text.toString()
            uuid = 2
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(sehir,derece,dereceAraligi,gunesli,uuid)
            findNavController().navigate(action)
        }

        binding.cardView3ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment3.text.toString()
            derece = binding.dereceTVListFragment3.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment3.text.toString()
            gunesli = binding.gunseliTVListFragment3.text.toString()
            uuid=3
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(sehir,derece,dereceAraligi,gunesli,uuid)
            findNavController().navigate(action)
        }

        binding.cardView4ListFragment.setOnClickListener {
            sehir = binding.sehirTVListFragment4.text.toString()
            derece = binding.dereceTVListFragment4.text.toString()
            dereceAraligi = binding.dereceAraligiTVListFragment4.text.toString()
            gunesli = binding.gunseliTVListFragment4.text.toString()
            uuid=4
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(sehir,derece,dereceAraligi,gunesli,uuid)
            findNavController().navigate(action)
        }

        setFragmentResultListener("requestKey"){ requestKey, bundle ->
            val result = bundle.getString("bundleKey")
            println("islem ici : " + args.uuidList)
            when(args.uuidList){
                1 -> binding.dereceTVListFragment1.text = result
                2 -> binding.dereceTVListFragment2.text = result
                3 -> binding.dereceTVListFragment3.text = result
                4 -> binding.dereceTVListFragment4.text = result
            }
            true
            println(result)
        }

    }
}