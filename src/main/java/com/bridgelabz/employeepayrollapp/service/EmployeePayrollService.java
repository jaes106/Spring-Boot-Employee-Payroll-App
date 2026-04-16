package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService {

    public EmployeePayrollData createEmployee(EmployeePayrollDTO dto) {
        return new EmployeePayrollData(1, dto);
    }

    public String getMessage() {
        return "Employee Payroll App is Running (via Service)";
    }
}