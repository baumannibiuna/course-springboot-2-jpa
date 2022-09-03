package com.baumannibiuna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baumannibiuna.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
