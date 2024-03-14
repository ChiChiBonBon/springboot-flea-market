package com.chibon.fleamarket.service;

import com.chibon.fleamarket.constant.ProductCategory;
import com.chibon.fleamarket.dto.ProductRequest;
import com.chibon.fleamarket.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory productCategory,String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
