package com.chibon.fleamarket.service;

import com.chibon.fleamarket.dto.CreateOrderRequest;
import com.chibon.fleamarket.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
