package com.demo.junitmockitodemospringboot.repository;

import com.demo.junitmockitodemospringboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Employee getById(int id);
}
