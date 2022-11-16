package com.aprilyang.springbootmall.service.impl;

import com.aprilyang.springbootmall.dao.ProductDao;
import com.aprilyang.springbootmall.model.Product;
import com.aprilyang.springbootmall.service.ProductService;
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
}
