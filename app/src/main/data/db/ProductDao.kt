package com.quickkart.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.quickkart.data.model.Product

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(products: List<Product>)

    @Query("SELECT * FROM Product")
    fun getAllProducts(): LiveData<List<Product>>
}
