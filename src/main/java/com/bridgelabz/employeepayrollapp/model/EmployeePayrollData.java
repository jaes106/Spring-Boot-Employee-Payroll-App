package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {

    private int id;
    private String name;
    private double salary;

    public EmployeePayrollData(int id, EmployeePayrollDTO dto) {
        this.id = id;
        this.name = dto.getName();
        this.salary = dto.getSalary();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
}