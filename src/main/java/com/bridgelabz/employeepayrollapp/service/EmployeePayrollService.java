package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {

    private List<EmployeePayrollData> employeeList = new ArrayList<>();
    private int idCounter = 1;

    // CREATE + STORE IN LIST
    public EmployeePayrollData create(EmployeePayrollDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(idCounter++, dto);
        employeeList.add(emp);
        return emp;
    }

    // OPTIONAL (to verify storage)
    public List<EmployeePayrollData> getAll() {
        return employeeList;
    }
}