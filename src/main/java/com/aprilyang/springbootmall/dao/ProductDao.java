package com.aprilyang.springbootmall.dao;

import com.aprilyang.springbootmall.dto.ProductRequest;
import com.aprilyang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
