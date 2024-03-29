package com.chibon.fleamarket.rowmapper;

import com.chibon.fleamarket.constant.ProductCategory;
import com.chibon.fleamarket.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_Name"));

        String categoryStr = resultSet.getString("category");
        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(category);

//        product.setCategory(ProductCategory.valueOf(categoryStr));

        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreated_date(resultSet.getTimestamp("created_date"));
        product.setLastModified_date(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
