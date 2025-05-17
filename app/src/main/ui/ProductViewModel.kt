package com.quickkart.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.quickkart.data.db.AppDatabase
import com.quickkart.repository.ProductRepository
import com.quickkart.data.model.Product
import kotlinx.coroutines.launch

class ProductViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ProductRepository
    val allProducts: LiveData<List<Product>>

    init {
        val dao = AppDatabase.getDatabase(application).productDao()
        repository = ProductRepository(dao)
        allProducts = repository.allProducts
        fetchProducts()
    }

    private fun fetchProducts() = viewModelScope.launch {
        repository.fetchProductsFromApiAndStore()
    }
}
