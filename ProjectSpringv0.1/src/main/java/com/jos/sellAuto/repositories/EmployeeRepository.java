package com.jos.sellAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jos.sellAuto.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
