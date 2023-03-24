package com.example.fragmentsexample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample.databinding.FragmentBlueBinding

class BlueFragment : Fragment() {

    private lateinit var binding: FragmentBlueBinding
    private var listener: OnFragmentActionsListener? = null

    /**
     * Encontramos un if(), que comprobará si el contexto que llega a la
     * función onAttach(), tiene implementada la interfaz que hemos creado
     */

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentActionsListener) {
            listener = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlueBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener{ listener?.onClickFragmentButton() }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}