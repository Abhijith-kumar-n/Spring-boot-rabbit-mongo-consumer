package com.example.springbootmongo.service;

import com.example.springbootmongo.Employee;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    @Bean
    public Employee save(Employee emp);
    public Optional<Employee> findById(int id);
    public List<Employee> findAll();
    public String deleteById(int id);
}
