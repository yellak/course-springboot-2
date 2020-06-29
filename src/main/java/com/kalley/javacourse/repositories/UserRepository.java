package com.kalley.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalley.javacourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
