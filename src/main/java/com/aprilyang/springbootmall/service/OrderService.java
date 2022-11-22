package com.aprilyang.springbootmall.service;

import com.aprilyang.springbootmall.dto.CreateOrderRequest;
import com.aprilyang.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
