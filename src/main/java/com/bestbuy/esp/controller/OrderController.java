package com.bestbuy.esp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bestbuy.esp.exception.OrderNotFoundException;
import com.bestbuy.esp.model.Order;
import com.bestbuy.esp.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/getOrder/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable int id) throws OrderNotFoundException {
		Optional<Order> order = orderService.getOrderById(id);
		
		if (!order.isPresent()) {
			throw new OrderNotFoundException("Book not exists in this store");
		} else {
			return new ResponseEntity<Order>(HttpStatus.OK);
		}
	}

}
