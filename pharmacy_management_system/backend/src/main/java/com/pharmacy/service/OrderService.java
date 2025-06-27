package com.pharmacy.service;

import com.pharmacy.dao.OrdersDAO;
import com.pharmacy.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrdersDAO ordersDAO;

    public void addOrder(Order order) {
        ordersDAO.addOrder(order);
    }

    public Order getOrder(int orderId) {
        return ordersDAO.getOrderById(orderId);
    }

    // Additional business methods related to Orders can go here
}
