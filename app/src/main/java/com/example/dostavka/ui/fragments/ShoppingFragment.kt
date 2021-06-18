package com.example.dostavka.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.dostavka.R
import com.example.dostavka.databinding.FragmentShoppingBinding

class ShoppingFragment : Fragment(R.layout.fragment_shopping) {

    private val binding: FragmentShoppingBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}