package com.example.springbootmongo.Application;

import com.example.springbootmongo.Application.mongodbapp.*;
import com.example.springbootmongo.Employee;
import com.example.springbootmongo.Repository.EmployeeRepository;
import com.example.springbootmongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class mongoconsume {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/AllEmployees")
    public List<Employee> AllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/FindEmployee/{id}")
    @Cacheable(value = "employee",key = "#id")
    public Optional<Employee> findEmploy(@PathVariable int id){
        return employeeService.findById(id);
    }
    @DeleteMapping("/DeleteEmploy/{id}")
    @CacheEvict(value = "employee",key = "#id")
    public Optional<Employee> deleteEmploy(@PathVariable int id){
        Optional<Employee> emplist=employeeService.findById(id);
        employeeService.deleteById(id);
        return emplist;
    }
}

