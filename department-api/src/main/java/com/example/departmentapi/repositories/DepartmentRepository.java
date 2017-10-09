package com.example.departmentapi.repositories;

import com.example.departmentapi.entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
