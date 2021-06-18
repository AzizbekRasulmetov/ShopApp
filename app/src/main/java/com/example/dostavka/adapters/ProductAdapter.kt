package com.example.dostavka.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dostavka.databinding.TopItemLayoutBinding

class ProductAdapter(private var imageList: List<Int>) :

    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(private val binding: TopItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind() {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                binding.image.setImageResource(imageList.get(position))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            TopItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) = holder.onBind()

    override fun getItemCount(): Int {
        return imageList.size
    }

}