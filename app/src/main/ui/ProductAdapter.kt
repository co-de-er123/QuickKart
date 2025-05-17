package com.quickkart.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.quickkart.data.model.Product
import com.quickkart.databinding.ItemProductBinding

class ProductAdapter : ListAdapter<Product, ProductAdapter.ProductViewHolder>(DiffCallback()) {

    class ProductViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = getItem(position)
        holder.binding.productTitle.text = product.title
        holder.binding.productPrice.text = "₹${product.price}"
    }

    class DiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(old: Product, new: Product): Boolean = old.id == new.id
        override fun areContentsTheSame(old: Product, new: Product): Boolean = old == new
    }
}
