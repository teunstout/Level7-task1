package com.example.bottomnavigationviewkotlin.fragmetns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.bottomnavigationviewkotlin.R
import kotlinx.android.synthetic.main.rated_fragment.*

class RatedFragment : Fragment() {

    private val args: RatedFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.rated_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textViewThankYou = activity?.findViewById<TextView>(R.id.tvThankYou)
        textViewThankYou?.text = getString(R.string.thank_you, args.rating)
    }


}
