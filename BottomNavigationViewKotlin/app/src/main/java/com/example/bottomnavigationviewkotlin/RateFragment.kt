package com.example.bottomnavigationviewkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.rate_fragment.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
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

        // Navigate to RatedFragment and send the rating as arguments.
        btnRate.setOnClickListener {
            val action = RatedFragmentDirections.actionRateFragmentToRatedFragment(rbRate.rating)
            findNavController().navigate(action)
        }
    }
}

