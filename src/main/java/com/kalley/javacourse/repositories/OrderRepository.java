package com.kalley.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalley.javacourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
