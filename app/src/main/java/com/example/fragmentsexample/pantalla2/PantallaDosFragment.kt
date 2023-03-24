package com.example.fragmentsexample.pantalla2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentsexample.R
import com.example.fragmentsexample.databinding.FragmentPantallaDosBinding
import com.example.fragmentsexample.databinding.FragmentPantallaUnoBinding


class PantallaDosFragment : Fragment(R.layout.fragment_pantalla_dos) {
    private lateinit var binding: FragmentPantallaDosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPantallaDosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIrUno = binding.btnIrPantallaUno
        val btnIrTres = binding.btnIrPantallaTres

        btnIrUno.setOnClickListener{findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaUnoFragment)}
        btnIrTres.setOnClickListener{findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaTresFragment)}
    }
}