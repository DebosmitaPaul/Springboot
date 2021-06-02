package com.ola.employeemanagement.controller;


import com.ola.employeemanagement.entity.Employee;
import com.ola.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping(path = "/details")
    public ResponseEntity<List<Employee>> employeeDetails(){
        List<Employee> employee1 = empService.displayEmployee();
        return  new ResponseEntity<>(employee1, HttpStatus.OK) ;
    }

    @GetMapping(path = "/add")
    public ResponseEntity<List<Employee>> addEmployee(){
        List<Employee> employee1 = empService.addEmployee();
        return  new ResponseEntity<>(employee1, HttpStatus.OK) ;
    }

}
