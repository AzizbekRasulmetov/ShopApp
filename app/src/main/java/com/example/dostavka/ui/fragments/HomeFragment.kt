package com.example.dostavka.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.dostavka.R
import com.example.dostavka.adapters.CategoryAdapter
import com.example.dostavka.adapters.DeliveryProductAdapter
import com.example.dostavka.adapters.ProductAdapter
import com.example.dostavka.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding: FragmentHomeBinding by viewBinding()

    private lateinit var topAdapter: ProductAdapter
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var deliveryProductAdapter: DeliveryProductAdapter
    private lateinit var imageList: List<Int>
    private lateinit var categoryList: List<Pair<Int, String>>
    private lateinit var deliveryProductList: List<Pair<Int, String>>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setTopRv()
        setCategoryRv()
        setDeliveryProductRv()
    }


    private fun setTopRv() {
        imageList = arrayListOf(
            R.drawable.fruits,
            R.drawable.doners,
            R.drawable.vegan
        )

        topAdapter = ProductAdapter(imageList)
        binding.topRecyclerView.apply {
            setHasFixedSize(true)
            adapter = topAdapter
        }

    }

    private fun setCategoryRv() {
        categoryList = mutableListOf(
            R.drawable.ic_new to getString(R.string.new_product),
            R.drawable.ic_food to getString(R.string.products),
            R.drawable.ic_beverage to getString(R.string.vegan),
            R.drawable.ic_food to getString(R.string.national_food)
        )

        categoryAdapter = CategoryAdapter(categoryList)
        binding.categoryRecyclerView.apply {
            setHasFixedSize(true)
            adapter = categoryAdapter
        }
    }

    private fun setDeliveryProductRv() {
        deliveryProductList = mutableListOf(
            R.drawable.icecream to getString(R.string.ice_cream),
            R.drawable.icecream to getString(R.string.ice_cream),
            R.drawable.icecream to getString(R.string.ice_cream),
            R.drawable.icecream to getString(R.string.ice_cream)
        )

        deliveryProductAdapter = DeliveryProductAdapter(deliveryProductList)
        binding.productRecyclerView.apply {
            setHasFixedSize(true)
            adapter = deliveryProductAdapter
        }
    }
}