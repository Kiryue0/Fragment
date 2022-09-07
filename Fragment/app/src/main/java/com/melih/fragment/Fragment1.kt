package com.melih.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.melih.fragment.databinding.Fragment1Binding

class Fragment1: Fragment(R.layout.fragment1) {
    private var _binding : Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonTKla.setOnClickListener {
            Toast.makeText(activity,"Merhaba",Toast.LENGTH_SHORT).show()
        }
    }
}