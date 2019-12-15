package com.bestbuy.esp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbuy.esp.model.Order;
import com.bestbuy.esp.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Optional<Order> getOrderById(int id) {
		return orderRepository.findById(id);
	}

}
