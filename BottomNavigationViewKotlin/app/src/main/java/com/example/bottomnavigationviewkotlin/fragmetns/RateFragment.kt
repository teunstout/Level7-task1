package com.example.bottomnavigationviewkotlin.fragmetns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationviewkotlin.R
import kotlinx.android.synthetic.main.rate_fragment.*

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
        // Navigate to RatedFragment and send the rating as arguments.
        btnRate?.setOnClickListener {
//            val action = RatedFragmentDirections.actionRateFragmentToRatedFragment(rbRate.rating)
//            findNavController().navigate(action)
        }
    }
}

