package com.techcodeme.ems.controller;

import com.techcodeme.ems.entity.Employee;
import com.techcodeme.ems.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){return employeeService.getAllEmployees();}

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){return employeeService.getEmployeeById(id);}
}
