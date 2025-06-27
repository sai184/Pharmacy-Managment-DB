package com.pharmacy.controllers;

import com.pharmacy.dao.OrderDAO;
import com.pharmacy.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderDAO orderDAO;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderDAO.getAllOrders();
    }

    @PostMapping
    public boolean createOrder(@RequestBody Order order) {
        return orderDAO.createOrder(order);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderDAO.getOrderById(id);
    }
}
