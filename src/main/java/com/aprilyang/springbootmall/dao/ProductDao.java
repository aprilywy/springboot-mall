package com.aprilyang.springbootmall.dao;

import com.aprilyang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
