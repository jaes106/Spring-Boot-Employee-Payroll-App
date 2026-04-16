package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeePayrollService {

    @Value("${spring.datasource.url:NOT_FOUND}")
    private String dbUrl;

    @PostConstruct
    public void checkEnv() {
        System.out.println("DB URL = " + dbUrl);
    }

    private List<EmployeePayrollData> employeeList = new ArrayList<>();
    private int idCounter = 1;

    public EmployeePayrollData create(EmployeePayrollDTO dto) {
        log.info("Creating employee: {}", dto.getName());

        EmployeePayrollData emp = new EmployeePayrollData(idCounter++, dto);
        employeeList.add(emp);

        return emp;
    }

    public List<EmployeePayrollData> getAll() {
        log.info("Fetching all employees");
        return employeeList;
    }

    public EmployeePayrollData update(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData emp = getById(id);

        emp.setName(dto.getName());
        emp.setSalary(dto.getSalary());

        return emp;
    }
    public EmployeePayrollData getById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }
}