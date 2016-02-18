package com.example;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;

@Entity
public interface OrderRepository extends CrudRepository<Order, Long>{



}