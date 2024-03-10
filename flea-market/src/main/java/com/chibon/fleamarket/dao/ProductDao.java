package com.chibon.fleamarket.dao;

import com.chibon.fleamarket.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
