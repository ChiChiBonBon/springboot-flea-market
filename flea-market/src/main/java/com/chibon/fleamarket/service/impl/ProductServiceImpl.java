package com.chibon.fleamarket.service.impl;

import com.chibon.fleamarket.dao.ProductDao;
import com.chibon.fleamarket.dto.ProductRequest;
import com.chibon.fleamarket.model.Product;
import com.chibon.fleamarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;


    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
