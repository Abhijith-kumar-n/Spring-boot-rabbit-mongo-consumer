package com.example.springbootmongo.Repository;

import com.example.springbootmongo.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
