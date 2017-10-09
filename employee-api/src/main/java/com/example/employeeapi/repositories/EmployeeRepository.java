package com.example.employeeapi.repositories;

import com.example.employeeapi.entities.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
