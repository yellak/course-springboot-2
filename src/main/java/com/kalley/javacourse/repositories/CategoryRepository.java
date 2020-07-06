package com.kalley.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalley.javacourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
