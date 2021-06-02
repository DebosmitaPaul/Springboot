package com.ola.employeemanagement.service;


import com.ola.employeemanagement.entity.Employee;
import com.ola.employeemanagement.repository.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeRepo empRepo;

    public List<Employee> displayEmployee(){
        List<Employee> emps = empRepo.findAll();
        return emps;
    }

    public List<Employee>  addEmployee(){
        List<Employee> emps = empRepo.saveAllAndFlush(listOfEmployees());
        return emps;
    }

    private List<Employee> listOfEmployees(){
        List<Employee> empObj = new ArrayList<>();
        empObj.add(new Employee("Debo"));
        empObj.add(new Employee("Smita"));
        empObj.add(new Employee("Paul"));

        return empObj;
    }

}
