package com.example.fragmentsexample.pantalla1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentsexample.R
import com.example.fragmentsexample.databinding.FragmentPantallaUnoBinding

class PantallaUnoFragment : Fragment(R.layout.fragment_pantalla_uno) {

    private lateinit var binding: FragmentPantallaUnoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPantallaUnoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnIrDos = binding.btnIrPantallaDos
        val btnIrTres = binding.btnIrPantallaTres

        btnIrDos.setOnClickListener{findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaDosFragment)}
        btnIrTres.setOnClickListener{findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaTresFragment)}
    }
}