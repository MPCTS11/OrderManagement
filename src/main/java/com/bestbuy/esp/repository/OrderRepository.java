package com.bestbuy.esp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bestbuy.esp.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
