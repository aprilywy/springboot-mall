package com.aprilyang.springbootmall.service;

import com.aprilyang.springbootmall.dto.CreateOrderRequest;
import com.aprilyang.springbootmall.dto.OrderQueryParams;
import com.aprilyang.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
