package com.chibon.fleamarket.service;

import com.chibon.fleamarket.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
