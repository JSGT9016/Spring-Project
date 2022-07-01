package com.jos.sellAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jos.sellAuto.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
