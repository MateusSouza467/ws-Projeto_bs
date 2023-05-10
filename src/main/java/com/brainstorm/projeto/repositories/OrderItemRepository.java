package com.brainstorm.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brainstorm.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
