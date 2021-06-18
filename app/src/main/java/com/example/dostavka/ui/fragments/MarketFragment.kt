package com.example.dostavka.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.dostavka.R
import com.example.dostavka.databinding.FragmentHomeBinding
import com.example.dostavka.databinding.FragmentMarketBinding

class MarketFragment : Fragment(R.layout.fragment_market) {

    private val binding: FragmentMarketBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}