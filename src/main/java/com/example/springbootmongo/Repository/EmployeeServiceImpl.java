package com.example.springbootmongo.Repository;

import com.example.springbootmongo.Employee;
import com.example.springbootmongo.service.EmployeeService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;

    public final Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);

    public Employee save(Employee emp){
        logger.debug(" >> EmployeeService : Saving Employee");
        return employeeRepository.save(emp);
    }
    public Optional<Employee> findById(int id) {
        logger.debug(" >> EmployeeService : Entering getEmployee");
        Optional<Employee> employeeOp =  employeeRepository.findById(id);

        if(employeeOp!=null){
            logger.debug(" << EmployeeService : Exiting getEmployee");

        }
        else{
            logger.debug(" << EmployeeService : No Such Employee Exists : Exiting getEmployee");

        }
        return employeeOp;
    }


    public List<Employee> findAll() {
        logger.debug(" >> EmployeeService : Entering findAll");
        logger.debug(" << EmployeeService : Exiting findAll");
        return employeeRepository.findAll();

    }


    public String deleteById(int id) {
        logger.debug(" << EmployeeService : Entering  deletebyid Employee");
         employeeRepository.deleteById(id);
         return "Deleted id : "+id;
    }

}
