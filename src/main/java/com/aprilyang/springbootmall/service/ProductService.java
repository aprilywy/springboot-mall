package com.aprilyang.springbootmall.service;

import com.aprilyang.springbootmall.dto.ProductRequest;
import com.aprilyang.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
