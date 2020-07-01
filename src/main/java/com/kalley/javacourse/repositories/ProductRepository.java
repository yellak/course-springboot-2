package com.kalley.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalley.javacourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
