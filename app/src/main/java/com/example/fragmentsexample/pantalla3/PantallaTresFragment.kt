package com.example.fragmentsexample.pantalla3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentsexample.R
import com.example.fragmentsexample.databinding.FragmentPantallaDosBinding
import com.example.fragmentsexample.databinding.FragmentPantallaTresBinding

class PantallaTresFragment : Fragment(R.layout.fragment_pantalla_tres) {

    private lateinit var binding: FragmentPantallaTresBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPantallaTresBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIrUno = binding.btnIrPantallaUno

        btnIrUno.setOnClickListener{findNavController().navigate(R.id.action_pantallaTresFragment_to_pantallaUnoFragment)}
    }
}