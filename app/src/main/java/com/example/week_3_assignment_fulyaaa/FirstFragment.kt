package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment(){

    lateinit var drySkinButton: TextView
    lateinit var combinationSkinButton: TextView
    lateinit var oilySkinButton: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        drySkinButton = view.findViewById(R.id.drySkinButton)
        combinationSkinButton = view.findViewById(R.id.combinationSkinButton)
        oilySkinButton = view.findViewById(R.id.oilySkinButton)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        drySkinButton.setOnClickListener {
            Navigation.findNavController(drySkinButton).navigate(R.id.action_firstFragment_to_secondFragment)
        }
        combinationSkinButton.setOnClickListener {
            Navigation.findNavController(combinationSkinButton).navigate(R.id.action_firstFragment_to_secondFragment)
        }
        oilySkinButton.setOnClickListener {
            Navigation.findNavController(oilySkinButton).navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }

}