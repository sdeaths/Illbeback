package com.example.illbeback.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.illbeback.R
import com.example.illbeback.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener{
            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.start, ThirdFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.backButton.setOnClickListener{
//            val fragmentManager = requireActivity().supportFragmentManager
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.start, StartFragment())
//            transaction.commit()
            requireActivity().onBackPressed()
        }
    }
}