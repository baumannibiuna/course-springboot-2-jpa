package com.baumannibiuna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baumannibiuna.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
