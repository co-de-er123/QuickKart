package com.quickkart.repository

import androidx.lifecycle.LiveData
import com.quickkart.data.api.RetrofitInstance
import com.quickkart.data.db.ProductDao
import com.quickkart.data.model.Product

class ProductRepository(private val productDao: ProductDao) {

    val allProducts: LiveData<List<Product>> = productDao.getAllProducts()

    suspend fun fetchProductsFromApiAndStore() {
        val response = RetrofitInstance.api.getProducts()
        if (response.isSuccessful) {
            response.body()?.let {
                productDao.upsertAll(it)
            }
        }
    }
}
