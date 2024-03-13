package com.chibon.fleamarket.dao;

import com.chibon.fleamarket.dto.ProductRequest;
import com.chibon.fleamarket.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
