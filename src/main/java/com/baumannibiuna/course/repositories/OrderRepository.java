package com.baumannibiuna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baumannibiuna.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
