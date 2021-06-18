package com.example.dostavka.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dostavka.databinding.ProductLayoutBinding

class DeliveryProductAdapter(private var deliveryProductList: List<Pair<Int, String>>) :

    RecyclerView.Adapter<DeliveryProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(private val binding: ProductLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind() {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val product = deliveryProductList[position]
                binding.productImage.setImageResource(product.first)
                binding.productNameTxt.setText(product.second)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ProductLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) = holder.onBind()

    override fun getItemCount(): Int {
        return deliveryProductList.size
    }

}