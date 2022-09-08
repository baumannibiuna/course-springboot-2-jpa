package com.baumannibiuna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baumannibiuna.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
