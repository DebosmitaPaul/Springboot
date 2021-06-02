package com.ola.employeemanagement.entity;

import javax.persistence.*;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String emp_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Employee() { }

    public Employee(String emp_name) {
        this.emp_name = emp_name;
    }

    @Override
    public String toString(){
        return "Employee [ id=" + id + ", firstName=" + emp_name +" ]";
    }
}
