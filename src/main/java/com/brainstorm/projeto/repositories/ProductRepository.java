package com.brainstorm.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brainstorm.projeto.entities.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {

}
