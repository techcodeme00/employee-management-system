package com.techcodeme.ems.repository;

import com.techcodeme.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
