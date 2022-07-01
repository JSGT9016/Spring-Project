package com.jos.sellAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jos.sellAuto.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
