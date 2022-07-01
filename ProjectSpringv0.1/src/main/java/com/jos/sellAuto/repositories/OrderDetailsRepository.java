package com.jos.sellAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jos.sellAuto.entities.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetails.CompositeId> {

}
