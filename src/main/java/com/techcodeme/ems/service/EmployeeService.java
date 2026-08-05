package com.techcodeme.ems.service;

import com.techcodeme.ems.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
}
