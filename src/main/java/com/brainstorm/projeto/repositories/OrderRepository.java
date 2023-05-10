package com.brainstorm.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brainstorm.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
