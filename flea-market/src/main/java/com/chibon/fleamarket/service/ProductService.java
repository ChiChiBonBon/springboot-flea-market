package com.chibon.fleamarket.service;

import com.chibon.fleamarket.dto.ProductRequest;
import com.chibon.fleamarket.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
