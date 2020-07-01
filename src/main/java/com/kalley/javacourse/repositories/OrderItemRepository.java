package com.kalley.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalley.javacourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
