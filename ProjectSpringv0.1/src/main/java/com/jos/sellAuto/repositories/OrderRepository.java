package com.jos.sellAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jos.sellAuto.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
