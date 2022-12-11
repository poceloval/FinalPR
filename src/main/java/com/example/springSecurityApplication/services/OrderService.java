package com.example.springSecurityApplication.services;

import com.example.springSecurityApplication.models.Order;
import com.example.springSecurityApplication.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    //Данный метод позволяет вернуть все заказы
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}