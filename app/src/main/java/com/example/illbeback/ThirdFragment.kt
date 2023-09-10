package com.example.illbeback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.illbeback.databinding.FragmentSecondBinding
import com.example.illbeback.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    lateinit var binding:FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButton2.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}