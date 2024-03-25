package com.chibon.fleamarket.dao;

import com.chibon.fleamarket.model.Order;
import com.chibon.fleamarket.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
}
