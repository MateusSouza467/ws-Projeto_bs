package com.brainstorm.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brainstorm.projeto.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
