package com.example.bottomnavigationviewkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationviewkotlin.R
import kotlinx.android.synthetic.main.rate_fragment.*
import kotlin.math.absoluteValue

class RateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.rate_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnRate = activity?.findViewById<Button>(R.id.btnRate)
        btnRate?.setOnClickListener {
                val action = RateFragmentDirections.actionRateFragmentToRatedFragment(rbRate.rating)
                findNavController().navigate(action)
        }
    }
}

