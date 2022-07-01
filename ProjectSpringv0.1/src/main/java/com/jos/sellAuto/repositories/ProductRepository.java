package com.jos.sellAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jos.sellAuto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
