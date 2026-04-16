package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeePayrollService {

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
}