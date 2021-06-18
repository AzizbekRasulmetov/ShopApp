package com.example.dostavka.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dostavka.databinding.CategoryLayoutBinding

class CategoryAdapter(private var categoryList: List<Pair<Int, String>>) :

    RecyclerView.Adapter<CategoryAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(private val binding: CategoryLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind() {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val category = categoryList[position]
                binding.productImage.setImageResource(category.first)
                binding.productNameTxt.setText(category.second)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            CategoryLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) = holder.onBind()

    override fun getItemCount(): Int {
        return categoryList.size
    }

}