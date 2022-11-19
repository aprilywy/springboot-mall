package com.aprilyang.springbootmall.dao;

import com.aprilyang.springbootmall.constant.ProductCategory;
import com.aprilyang.springbootmall.dto.ProductRequest;
import com.aprilyang.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
