package com.chibon.fleamarket.service;

import com.chibon.fleamarket.dto.CreateOrderRequest;
import com.chibon.fleamarket.dto.OrderQueryParams;
import com.chibon.fleamarket.model.Order;

import java.util.List;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
}
